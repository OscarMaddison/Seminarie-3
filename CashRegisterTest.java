/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.model;

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
public class CashRegisterTest {
    
    public CashRegisterTest() {
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
     * Test of addPayment method, of class CashRegister.
     */
    @Test
    public void testAddPayment() {
        double totPrice = 50.0;
        CashRegister instance = new CashRegister();
        instance.addPayment(totPrice);
        double result = instance.getAllTheCash();
        double expResult = 50.0;
        assertEquals(expResult, result, "kollar om det totala priset är rätt");
    }
    
}
