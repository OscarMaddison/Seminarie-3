package com.mycompany.seminarie3.view;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;
import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.RegistryCreator;
import com.mycompany.seminarie3.integration.Printer;
import com.mycompany.seminarie3.controller.Controller;
import com.mycompany.seminarie3.integration.ItemScannedDTO;
import com.mycompany.seminarie3.exceptions.InvalidItemException;
import com.mycompany.seminarie3.integration.Observer;
import com.mycompany.seminarie3.view.TotalRevenueView;
import com.mycompany.seminarie3.integration.TotalRevenueFileOutput;

import java.util.*;

public class View {
    
    int[] shoppingList = {4, 1, 2, 1, 2, 3};
    
    List<Items> listOfItems = new ArrayList<>();
    
    double totPrice = 0;
    
    RegistryCreator regCreator = new RegistryCreator();
    
    Printer printer = new Printer();
    
    Controller controller = new Controller(regCreator, printer);

    
    public View(Controller control){
        controller = control;
        
        controller.addObservers(new ArrayList<Observer>(Arrays.asList(new TotalRevenueView(), new TotalRevenueFileOutput())));
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
                
            try{
                ItemScannedDTO registerResult = controller.registerItem(i, totPrice, listOfItems);
            
                totPrice = registerResult.getPrice();
            
                Item scanItem = registerResult.getItem();
            
                listOfItems = registerResult.getItemList();
            
                System.out.println(scanItem.getItemName());
            
                System.out.println(scanItem.getPrice());

                System.out.println(totPrice);
            } catch (InvalidItemException e){
                int errorID = e.getItemID();
                
                System.out.print("The product ID '" + e.getItemID() + "' is not in the product registry (user)\n");
                
                System.out.print("The product ID '" + e.getItemID() + "' is not in the product registry (log)\n");
            }
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
        
        listOfItems.clear();
        
        totPrice = 0;
    }
}
