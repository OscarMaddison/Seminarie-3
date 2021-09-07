package com.mycompany.seminarie3.controller;

import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.model.CashRegister;
import com.mycompany.seminarie3.model.ItemList;
import com.mycompany.seminarie3.model.PriceCalculator;
import com.mycompany.seminarie3.integration.ItemIdentifier;
import com.mycompany.seminarie3.model.CurrentSale;
import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.integration.ItemScannedDTO;
import com.mycompany.seminarie3.model.Receipt;
import com.mycompany.seminarie3.exceptions.DatabaseError;
import com.mycompany.seminarie3.exceptions.InvalidItemException;
import com.mycompany.seminarie3.integration.Observer;

import java.util.*;

/**
 * @author Oscar
 */

public class Controller{
    List<Item> productRegistry = new ArrayList<>();
    
    RegistryCreator registryCreator = new RegistryCreator();
    
    Printer printer = new Printer();
    
    public Controller(RegistryCreator regCreator, Printer print){
        this.productRegistry = regCreator.getProductRegistry();
        
        this.registryCreator = regCreator;
        
        this.printer = print;
    }
    
    CashRegister cashReg = new CashRegister();

    ItemList itemList = new ItemList();

    PriceCalculator priceCalc = new PriceCalculator();
    
    ItemIdentifier itemIdentifier = new ItemIdentifier();
    
    List<Receipt> saleRegistry = registryCreator.getSaleRegistry();
    
    /**
    * String[] saleRegistry = saleReg.getSaleRegistry();
    */

    /**
     * discount[] discReg = RegCreator.getDiscountRegistry();
     */

    /**
     * DiscountIdentifier discIdentifier = new DiscountIdentifier();
     */

    CurrentSale currentSale = new CurrentSale();
    
    public void addObservers(ArrayList<Observer> observers){
        registryCreator.addObservers(observers);
    }

    /**
     * scannar alla varor som inmatats från view och sänder resultatet till view
     * @param regItem
     * @param totPrice
     * @param listOfItems
     * @return registerResult
     * @throws DatabaseError is the server can't be reached
     * @throws InvalidItemException if the item ID isn't in the product registry
     */
    public ItemScannedDTO registerItem(int regItem, double totPrice, List<Items> listOfItems){
	if (regItem == 0){
            // detta ska simulera att anslutningen till databasen inte funkar
            
            throw new DatabaseError("The server could not be reached (user)\n", "The server could not be reached (log)\n");
        }
        
        try{
            /**
            * @param den nyligen skannade varans ID
            * @return Den skannade varans information
            */
            Item scanItem = itemIdentifier.findItem (regItem, productRegistry);
            /**
            * @param den nyligen skannade varan
            * @return alla skannade varorna
            */
            listOfItems = itemList.updateItemList(listOfItems, scanItem);

            /**
            * @param den nyligen skannade varan, det totala priset
            * @return det uppdaterade totala priset
            */
            totPrice = priceCalc.updateTotalPrice(scanItem, totPrice);
            
            ItemScannedDTO registerResult = new ItemScannedDTO(totPrice, listOfItems, scanItem);
            
            return registerResult;
	} catch (InvalidItemException e){
        }
        
        return null;
    }

    /**
    * togs bort då rabatterna inte behöver ingå i programmet
    * public static double endRegistration(double totPrice, int customerID, List<Items> listOfItems){

	/**
	* @param det totala priset innan rabatterna, kundID, alla de skannade varorna
	* @return de tillgängliga rabatterna
	* /
	identifiedDiscounts = discIdentifier.identifyDiscount(totPrice, customerID, allTheItems);

	/**
	* @param det totala priset innan rabatterna, de tillgängliga rabatterna
	* @return det slutgiltiga priset
	* /
	totPrice = priceCalc.totPriceWithDiscount(totPrice, identifiedDiscounts);

	return totPrice;
    }
    */

    /**
     * ser till att betalningen sker och dokumenteras ordentligt
     * @param listOfItems
     * @param totPrice 
     */
    public void pay(List<Items> listOfItems, double totPrice){
	
	currentSale.pay(totPrice);

	cashReg.addPayment(totPrice);

	Receipt  sale = currentSale.endSale(listOfItems, totPrice, printer);
        
        registryCreator.logSale(sale);
    }
}