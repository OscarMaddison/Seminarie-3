package com.mycompany.seminarie3.model;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * denna klass bevarar alla pengar som programmet tjänar in.
 */

public class CashRegister {
    double allTheCash = 0;
	
    public void addPayment(double totPrice){
        allTheCash = allTheCash + totPrice;
    }
    
    public double getAllTheCash(){
        return allTheCash;
    }
}