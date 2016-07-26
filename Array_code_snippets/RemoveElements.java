/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyprobs;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author kimaiga
 */
public class RemoveElement {
    
public static void main(String[] args) {
      
   // create an empty array list
   ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

   // use add() method to add elements 
   arrlist.add(20);
   arrlist.add(15);
   arrlist.add(30);
   arrlist.add(45);

   System.out.println("Size of list: " + arrlist.size());
	
   // Print all the elements  in list
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   }  
	
   // Remove element at 3rd position
   arrlist.remove(2);

   System.out.println("Size of list: " + arrlist.size());
	
   //Print all the elements available in list
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   }
   }

}
