/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.integration.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class PriceCalculatorTest {
    
    PriceCalculator instance = new PriceCalculator();
    
    public PriceCalculatorTest() {
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
     * Test of updateTotalPrice method, of class PriceCalculator.
     */
    @Test
    public void testUpdateTotalPrice() {
        System.out.println("updateTotalPrice");
        Item scanItem = new Item(10, 0.2, 4, "hej");
        double totPrice = 20;
        double expPrice = 20 + 10 + 10 * 0.2;
        totPrice = instance.updateTotalPrice(scanItem, totPrice);
        assertEquals(expPrice, totPrice, "kollar om det totala priset är rätt");
    }
}
/**
 * Funkar
 */