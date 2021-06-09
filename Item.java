package com.mycompany.seminarie3.integration;

/**
 * @author Oscar
 */

/**
 * en klass som innehåller information om olika varor
 */

public class Item{
    public double price;

    public double VATRate;

    public int itemID;
    
    public String itemName;
    
    public Item(double pr, double VAT, int ID, String name){
        price = pr;
        
        VATRate = VAT;
        
        itemID = ID;
        
        itemName = name;
    }

    public double getPrice(){
        return price;
    }

    public double getVATRate(){
        return VATRate;
    }

    public int getItemID(){
        return itemID;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public boolean equals(Object object){
        Item item = (Item) object;
        
        if (itemID == item.getItemID()){
            return true;
        }
        
        return false;
    }
}
