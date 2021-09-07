package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Item;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * en DTO som skickar diverse info från scanningen tillbaka till View
 */

public class ItemScannedDTO {
    double price;
    
    Item scannedItem;
    
    List<Items> itemList;
    
    public ItemScannedDTO(double totPrice, List<Items> allItems, Item scanItem){
        this.price = totPrice;
        this.itemList = allItems;
        this.scannedItem = scanItem;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public Item getItem(){
        return this.scannedItem;
    }
    
    public List<Items> getItemList(){
        return this.itemList;
    }
}
