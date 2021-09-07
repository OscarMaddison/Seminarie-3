/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.integration;

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
public class ItemsTest {
    
    public ItemsTest() {
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
    @Disabled("pointless")
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Items instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    */

    /**
    @Disabled("pointless")
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Items instance = null;
        Item expResult = null;
        Item result = instance.getItem();
        assertEquals(expResult, result);
    }
    */
    
    @Test
    public void testAdd() {
        System.out.println("add");
        Items instance = new Items (3, new Item(10, 0.2, 4, "hej"));
        int testQuantity = 4;
        instance.add();
        int quantity = instance.getQuantity();
        assertEquals(testQuantity, quantity);
    }
}
/**
 * Funkar
 */