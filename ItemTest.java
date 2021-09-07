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
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        Item item1 = new Item(10, 0.2, 4, "hej");
        Item item2 = new Item(10, 0.2, 4, "hej");
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

    @Test
    public void testEqual() {
        int amount = 3;
        Item item1 = new Item(10, 0.2, 4, "hej");
        Item item2 = new Item(10, 0.2, 4, "hej");
        boolean expResult = true;
        boolean result = item1.equals(item2);
        assertEquals(expResult, result, "Items with the same ID are equal.");
    }
}
/**
 * Funkar
 */
