package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * modellerar ett kvitto
 */

public class Receipt {
    private List<Items> items;
    
    private double finalPrice;
    
    public Receipt(List<Items> goods, double price){
        this.items = goods;
        
        this.finalPrice = price;
    }
    
    public List<Items> getItems(){
        return items;
    }
    
    public double getFinalPrice(){
        return finalPrice;
    }
}
