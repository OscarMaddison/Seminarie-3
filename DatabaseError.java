/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.exceptions;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class DatabaseError extends RuntimeException{
    public DatabaseError(String errorMessage){
        super(errorMessage);
    }
}
