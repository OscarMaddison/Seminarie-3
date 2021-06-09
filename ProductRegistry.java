package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * en klass som innehåller listan över alla godtagbara potentiella varor
 */

public class ProductRegistry {
    List<Item> registry = new ArrayList<>(Arrays.asList(new Item(130, 0.2, 1, "herpaderp"), new Item(80, 0.3, 2, "derpaherp"), new Item(60, 0.2, 3, "herpaderpherp")));
    
    public List<Item> getProductRegistry(){
	return registry;
    }
}
