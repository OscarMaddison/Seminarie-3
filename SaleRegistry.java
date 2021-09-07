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
    
    double totalRevenue = 0;
    
    private List<Observer> observers = new ArrayList<>();
	
    public List<Receipt> getSaleRegistry(){
	return registry;
    }
    
    // Called by any method in this class that has changed the class' state.
    private void notifyObservers(double updatedRevenue) {
        for (Observer observer : observers) {
            observer.stateHasChanged(updatedRevenue);
        }
    }
        
    /**
     * sätter in informationen om ny försäljning (samma info som finns på kvittot) i registret 
     * @param receipt 
     */
    public void logSale(Receipt receipt){
        registry.add(receipt);
        
        double finalPrice = receipt.getFinalPrice();
        
        totalRevenue = totalRevenue + finalPrice;
        
        notifyObservers(totalRevenue);
    }

    /**
     * Registers observers. Any <code>Observer</code> that is passed to this method will be notified
     * when this object changes state.
     *
     * @param observer TotalRevenueFileOutput & TotalRevenueView.
     */
    public void addObservers(ArrayList<Observer> newObservers) {
        for (Observer o : newObservers){
            observers.add(o);
        }
    }
}
