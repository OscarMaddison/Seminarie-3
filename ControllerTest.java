/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.controller;

import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.integration.ItemScannedDTO;
import com.mycompany.seminarie3.integration.ItemIdentifier;
import com.mycompany.seminarie3.exceptions.DatabaseError;

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
public class ControllerTest {
    
    ItemIdentifier testItemIdentifier = new ItemIdentifier();
    RegistryCreator testRegCreator = new RegistryCreator();
    Printer testPrinter = new Printer();
    List<Item> registry = testRegCreator.getProductRegistry();
    Controller instance = new Controller(testRegCreator, testPrinter);
    
    public ControllerTest() {
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
     * Test of registerItem method, of class Controller.
     */
    @Test
    public void testRegisterItem() throws DatabaseError {
        System.out.println("registerItem");
        int regItem1 = 1;
        int regItem2 = 2;
        double totPrice = 0;
        List<Items> allItems = new ArrayList<>();
        double expPrice = 260;
        ItemScannedDTO scanResult1 = instance.registerItem(regItem1, totPrice, allItems);
        totPrice = scanResult1.getPrice();
        allItems = scanResult1.getItemList();
        ItemScannedDTO scanResult2 = instance.registerItem(regItem2, totPrice, allItems);
        totPrice = scanResult2.getPrice();
        allItems = scanResult2.getItemList();
        assertEquals(expPrice, totPrice, "kolla om det totala priset uppdateras ordentligt");
        List<Items> expItems = new ArrayList<>(Arrays.asList(new Items(1, new Item(130, 0.2, 1, "herpaderp")), new Items(1, new Item(80, 0.3, 2, "derpaherp"))));
        assertEquals(expItems.get(0).getQuantity(), allItems.get(0).getQuantity(), "kollar om listan med alla varor stämmer");
        assertEquals(expItems.get(0).getItem(), allItems.get(0).getItem(), "kollar om listan med alla varor stämmer");
        assertEquals(expItems.get(1).getQuantity(), allItems.get(1).getQuantity(), "kollar om listan med alla varor stämmer");
        assertEquals(expItems.get(1).getItem(), allItems.get(1).getItem(), "kollar om listan med alla varor stämmer");
    }

    @Test
    public void testDatabaseError() {
        int regItem = 0;
        List<Items> allItems = new ArrayList<>();
        try{
            ItemScannedDTO scanResult = instance.registerItem(regItem, 0, allItems);
            fail("exception funkar inte");
        } catch(DatabaseError e){
        }
    }    
    /**
     * Test of pay method, of class Controller.
     */
    /**
    @Test
    public void testPay() {
        System.out.println("pay");
        List<Items> allItems = null;
        double totPrice = 0.0;
        Controller instance = null;
        instance.pay(allItems, totPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
/**
 * Funkar
 * Vet inte hur man skriver ett test som kollar om en exception throwas eller inte, men när jag skrev in fel vara av misstag så blev det iallafall ett exception
 */