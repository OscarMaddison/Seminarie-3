/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.integration;
import com.mycompany.seminarie3.exceptions.InvalidItemException;

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
public class ItemIdentifierTest {
    
    ItemIdentifier instance = new ItemIdentifier();
    ProductRegistry prodReg = new ProductRegistry();
    List<Item> registry = prodReg.getProductRegistry();
    
    public ItemIdentifierTest() {
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
     * Test of checkItemValidity method, of class ItemIdentifier.
     */
    @Test
    public void testFindItem() throws Exception{
        int regItem = 1;
        Item expScan = new Item(130, 0.2, 1, "herpaderp");
        Item scanItem = instance.findItem(regItem, registry);
        assertEquals(expScan, scanItem);
    }
    
    /**
     * tests the InvlaidItem exception
     */
    @Test
    public void testInvalidItem() throws InvalidItemException{
        int regItem = 4;
        Item expScan = new Item(130, 0.2, 1, "herpaderp");
        try{
            Item scanItem = instance.findItem(regItem, registry);
            fail("InvalidItemException isn't working");
        } catch(InvalidItemException e){
            System.out.println(e);
        }
    }
}
/**
 * Funkar
 */
