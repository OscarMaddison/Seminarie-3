package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;

import java.util.*;
import java.lang.*;

/**
 * @author Oscar
 */

/**
 * identifierar varor utifrån deras ID
 */

public class ItemIdentifier {
    public Item findItem(int regItem, List<Item> registry) throws Exception{
        for (Item i : registry){
            if (regItem == (i.getItemID())){
                return i;
            }
        }
        
        throw new Exception("invalid item");
    }    
}
