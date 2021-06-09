package com.mycompany.seminarie3.view;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.controller.Controller;
import com.mycompany.seminarie3.integration.ItemScannedDTO;

import java.util.*;

public class View {
    
    int[] shoppingList = {1, 1, 2, 1, 2, 3};

    List<Items> listOfItems = new ArrayList<>();
    
    double totPrice = 0;
    
    RegistryCreator regCreator = new RegistryCreator();
    
    Printer printer = new Printer();
    
    Controller controller = new Controller(regCreator, printer);
    
    public View(Controller control){
        controller = control;
    }
    
    /**
     * genomför programmet
     * @throws Exception 
     */
    public void execute() throws Exception{
        for (int i : shoppingList){
            /**
            * @param den nyligen skannade varan, det totala priset, listan över skannade varor
            * @return information om varan, det uppdaterade priset, och den uppdaterade listan
            */
                
            ItemScannedDTO registerResult = controller.registerItem(i, totPrice, listOfItems);
                
            totPrice = registerResult.getPrice();
            
            Item scanItem = registerResult.getItem();
            
            listOfItems = registerResult.getItemList();
            
            System.out.println(scanItem.getItemName());
            
            System.out.println(scanItem.getPrice());

            System.out.println(totPrice);
        }

        /**
        * @param kundens ID, totala priset innan rabatterna applicerats, de registrerade varorna
        * @return det slutgiltiga priset efter rabatterna
        */
        /**@Disable
        */
        
        /**
        * totDiscount = controller.endRegistration(totPrice, customerID, regItems);
        */
        
        /**
        * @param det totala priset
        */
        controller.pay(listOfItems, totPrice);
    }
}
