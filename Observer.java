/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.integration;

/**
 *
 * @author Oscar
 */
public interface Observer {
    /**
     * Called when the observed class changes state.
     */
    void stateHasChanged(double totalRevenue);
}