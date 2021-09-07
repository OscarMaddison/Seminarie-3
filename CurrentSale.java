package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.model.Receipt;
import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.integration.Printer;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * har hand om transaktionen
 */

public class CurrentSale {
    
    /**
     * @param det totala priset 
     */
    public void pay (double totPrice){
	/**
	* Vet inte hur koden för själva betalningen ska se ut
	*/
    }
    
    /**
     * @param de registrerade varorna, det totala priset
     * @return kvittot
     */
    public Receipt endSale(List<Items> listOfItems, double totPrice, Printer printer){

	Receipt receipt = new Receipt(listOfItems, totPrice);
        
        printer.printReceipt(receipt);
        
        return receipt;
    }
}