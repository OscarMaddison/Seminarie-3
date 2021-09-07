/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
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
public class ItemListTest {
    
    public ItemListTest() {
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
     * Test of isDuplicate method, of class ItemList.
     */
    @Test
    public void testIsDuplicate() {
        Item regItem1 = new Item(10, 20, 4, "hej");
        Item regItem2 = new Item(10, 20, 5, "tjej");
        List<Item> regItems = new ArrayList<>(Arrays.asList(regItem1, regItem2));
        Items scannedItem = new Items(1, new Item(10, 20, 4, "hej"));
        List<Items> itemList = new ArrayList<>(Arrays.asList(scannedItem));
        ItemList instance = new ItemList();
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean[] expResults = {expResult1, expResult2};
        for (int i = 0; i < 2; i++){
            assertEquals(expResults[i], instance.isDuplicate(regItems.get(i), itemList), "kollar om funktionen ger rätt resultat");
        }
    }

    /**
     * Test of updateItemList method, of class ItemList.
     */
    @Test
    public void testUpdateItemList() {
        Item scanItem1 = new Item(10, 0.2, 4, "hej");
        Item scanItem2 = new Item(20, 0.1, 5, "tjej");
        Item scanItem3 = new Item(10, 0.2, 4, "hej");
        List<Item> regItems = new ArrayList<>(Arrays.asList(scanItem1, scanItem2, scanItem3));
        List<Items> itemList = new ArrayList<>();
        ItemList instance = new ItemList();
        for (Item i:regItems){
            itemList = instance.updateItemList(itemList, i);
        }       
        Item expItem1 = new Item(10, 0.2, 4, "hej");
        Item expItem2 = new Item(20, 0.1, 5, "tjej");
        Items expItems1 = new Items(2, (expItem1));
        Items expItems2 = new Items(1, (expItem2));
        List<Items> expItemList = new ArrayList<>(Arrays.asList(expItems1, expItems2));
        for (int j = 0; j < 2; j++){
            assertEquals(itemList.get(j).getQuantity(), expItemList.get(j).getQuantity(), "kollar om varornas kvantitet är rätt");
            boolean itemResult = itemList.get(j).getItem().equals(expItemList.get(j).getItem());
            assertEquals(itemResult, true, "kollar om varorna är rätt");
        }
    }

    /**
     * Test of getItemList method, of class ItemList.
     */
    /**
    @Disabled("useless")
    @Test
    public void testGetItemList() {
        System.out.println("getItemList");
        ItemList instance = new ItemList();
        Items[] expResult = null;
        Items[] result = instance.getItemList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
/**
 * Funkar
 */