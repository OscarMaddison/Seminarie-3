package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.model.Receipt;
import java.util.*;

/**
 * @author Oscar
 */

/**
 * en klass som innehåller listan över alla genomförda affärer
 */

public class SaleRegistry {
    List<Receipt> registry = new ArrayList<>();
	
    public List<Receipt> getSaleRegistry(){
	return registry;
    }
        
    /**
     * sätter in informationen om ny försäljning (samma info som finns på kvittot) i registret 
     * @param receipt 
     */
    public void logSale(Receipt receipt){
        registry.add(receipt);
    }
}
