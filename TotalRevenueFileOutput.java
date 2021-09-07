/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.integration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Oscar
 */
public class TotalRevenueFileOutput implements Observer{
    private PrintWriter logStream;

    /**
     * Creates a new instance and also creates a new log file. An existing log file will be deleted.
     * @throws IOException in case the file can't be written to.
     */
    public TotalRevenueFileOutput() {
        try {
            logStream = new PrintWriter(new FileWriter("log.txt"), true);
        } catch (IOException ioe) {
            System.out.println("CAN NOT LOG.");
            ioe.printStackTrace();
        }
    }
    
    @Override
    public void stateHasChanged(double totalRevenue) {
        logStream.println(totalRevenue);
    }
}
