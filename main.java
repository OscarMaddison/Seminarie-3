package com.mycompany.seminarie3.startup;

import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.controller.Controller;
import com.mycompany.seminarie3.view.View;

import java.util.*;

public class main{
    public static void main(String[] args) throws Exception{
        RegistryCreator regCreator = new RegistryCreator();

        Printer printer = new Printer();

        Controller controller = new Controller(regCreator, printer);

        View view = new View(controller);
        
        view.execute();
    }
}