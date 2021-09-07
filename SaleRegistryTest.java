/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.integration;

import com.mycompany.seminarie3.model.Receipt;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.seminarie3.view.TotalRevenueView;
import com.mycompany.seminarie3.integration.TotalRevenueFileOutput;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class SaleRegistryTest {
    
    public SaleRegistryTest() {
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
     * Test of logSale method, of class SaleRegistry.
     */
    @Test
    public void testLogSale() {
        System.out.println("logSale");
        Item good = new Item(130, 0.2, 1, "herpaderp");
        Items goods = new Items(2, good);
        Receipt receipt = new Receipt(new ArrayList<>(Arrays.asList(goods)), 260);
        SaleRegistry instance = new SaleRegistry();
        instance.logSale(receipt);
        List<Receipt> expectedSaleRegistry = new ArrayList<>(Arrays.asList(receipt));
        List<Receipt> saleRegistry = instance.getSaleRegistry();
        assertEquals(expectedSaleRegistry, saleRegistry);
    }  
}
