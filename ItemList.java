package com.mycompany.seminarie3.model;

import com.mycompany.seminarie3.integration.Item;
import com.mycompany.seminarie3.integration.Items;

import java.util.*;

/**
 * @author Oscar
 */

/**
 * har hand om listan över skannade varor
 */

public class ItemList {
    
    List<Items> itemList = new ArrayList<>();
	
    /**
     * kollar om en vara redan finns i listan eller inte
     * @param regItem
     * @param itemList
     * @return 
     */
    boolean isDuplicate(Item regItem, List<Items> itemList){
	for (Items i : itemList){
            if (i.item.equals(regItem)){
                return true;
            }
	}
			
	return false;
    }
	/**
         * uppdaterar listan med en ny vara
         * @param itemList
         * @param regItem
         * @return 
         */
    public List<Items> updateItemList(List<Items> itemList, Item regItem){
        /**
         * @param listan över skannade föremål, det skannade föremålet
         * @return huruvida det skannade föremålet redan finns i listan
         */
        if (isDuplicate(regItem, itemList) == true){
            for (Items j : itemList){
                if (j.item.equals(regItem)){
                    j.add();
                }
            }
        }
		
        else{
            Items newItem = new Items(1, regItem);
            itemList.add(newItem);
        }
        
        return itemList;
    }
	
    public List<Items> getItemList(){
	return itemList;
    }
}