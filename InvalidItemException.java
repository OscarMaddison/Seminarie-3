/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.exceptions;

import com.mycompany.seminarie3.model.Receipt;
import java.util.*;

/**
 *
 * @author Oscar
 */
public class InvalidItemException extends Exception{
    int itemID;
    
    public int getItemID(){
        return this.itemID;
    }
    
    public InvalidItemException(int itemID){
        this.itemID = itemID;
        }
}
