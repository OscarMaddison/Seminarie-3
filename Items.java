package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;

/**
 * @author Oscar
 */

/**
 * en klass som hanterar ett godtyckligt antal av ett och samma Item
 */

public class Items{
    public int quantity;

    public Item item;
    
    public Items(int number, Item product){
        quantity = number;
        item = product;
    }

    public int getQuantity(){
        return quantity;
    }

    public Item getItem(){
        return item;
    }

    public void add(){
        quantity++;
    }
}
