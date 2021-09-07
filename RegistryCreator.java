package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.model.Receipt;
import com.mycompany.seminarie3.integration.ProductRegistry;
import com.mycompany.seminarie3.integration.SaleRegistry;
import com.mycompany.seminarie3.integration.Observer;
import java.util.*;

/**
 * @author Oscar
 */

/**
 * skapar de olika registry-klasserna
 */

public class RegistryCreator {
    ProductRegistry prodReg = new ProductRegistry();
	
    SaleRegistry saleReg = new SaleRegistry();
    
    //List<Observer> Observers = new ArrayList<>();
    
    /**
    * DiscountRegistry discReg = new DiscountRegistry();
    */
    
    public List<Item> getProductRegistry(){
        List<Item> products = prodReg.getProductRegistry();
        return products;
    }
    
    public List<Receipt> getSaleRegistry(){
        List<Receipt> sales = saleReg.getSaleRegistry();
        return sales;
    }
    
    /**
    * * togs bort då rabatterna inte behöver ingå i programmet
    * public Disocunt[] getDiscountRegistry{
        Discount[] discounts = discReg.getDiscountRegistry;
        return discounts;
    }
    */
    
    public void addObservers(ArrayList<Observer> observers){
        saleReg.addObservers(observers);
    }
    
    /**
    * sätter in köpinformationen i saleRegistry
    * @param kvittot
    */
    public void logSale(Receipt receipt){
        saleReg.logSale(receipt);
    }
}
