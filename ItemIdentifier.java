package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.exceptions.InvalidItemException;

import java.util.*;
import java.lang.*;

/**
 * @author Oscar
 */

/**
 * identifierar varor utifrån deras ID
 */

public class ItemIdentifier {
    public Item findItem(int regItem, List<Item> registry) throws InvalidItemException{
        for (Item i : registry){
            if (regItem == (i.getItemID())){
                return i;
            }
        }
        
        //om metoden anropas för ett ItemID som inte finns i SaleRegistry    
        throw new InvalidItemException(regItem);
    }
}
