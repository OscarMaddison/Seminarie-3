/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.view;

import com.mycompany.seminarie3.integration.Observer;

/**
 *
 * @author Oscar
 */
public class TotalRevenueView implements Observer{
    @Override
    public void stateHasChanged(double totalRevenue) {
        System.out.print(totalRevenue);
    }
}
