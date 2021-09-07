package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * Räknar ut det totala priset
 */

public class PriceCalculator {
    public double updateTotalPrice(Item scanItem, double totPrice){
        double VAT = scanItem.getPrice() * scanItem.getVATRate();
        
        totPrice = totPrice + scanItem.getPrice() + VAT;
        
        return totPrice;
    }
	
    /**
    * togs bort då rabatterna inte behöver ingå i programmet
    * public static double totPriceWithDiscount(double totPrice, Discount[] identifiedDiscounts){
	for (Discount i : identifiedDiscounts){
            totPrice = applyDiscount(totPrice, i);
	}
		
        return totPrice;
    }
    */
	
    /**
    * togs bort då rabatterna inte behöver ingå i programmet
    * private static double applyDiscount(double totPrice, Discount discount){
	/**
         * @return huruvida det är en direktrabatt eller inte
         * /
        if (discount.isFlat == true){
            totPrice = totPrice - discount.amount;
	}
		
	else{
            totPrice = totPrice * discount.amount;
	}
		
	return totPrice;
    }
    */
}
