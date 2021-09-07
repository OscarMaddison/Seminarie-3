/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oscar
 */
public class TotalRevenueViewTest {
    
    public TotalRevenueViewTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of stateHasChanged method, of class TotalRevenueView.
     */
    @Test
    public void testStateHasChanged() {
        System.out.println("stateHasChanged");
        double totalRevenue = 0.0;
        TotalRevenueView instance = new TotalRevenueViewImpl();
        instance.stateHasChanged(totalRevenue);
    }

    public class TotalRevenueViewImpl extends TotalRevenueView {
    }
    
}
