/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.view;
import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.controller.Controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oscar
 */
public class ViewTest {
    
    public ViewTest() {
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
     * Tests that the observers update their numbers correctly for sequential sales.
     */
    @Disabled
    @Test
    public void testMultipleSales() throws Exception {
        System.out.println("execute");
        RegistryCreator instanceRegCreator = new RegistryCreator();
        Printer instancePrinter = new Printer();
        Controller instanceControl = new Controller(instanceRegCreator, instancePrinter);
        View instance = new View(instanceControl);
        instance.execute();
        instance.execute();
    }
    
}
