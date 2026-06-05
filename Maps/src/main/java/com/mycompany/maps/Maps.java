/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maps;


import java.util.*;
        
/**
 *
 * @author RSS - Siphelele
 */
        /*
        Create map by using class HashMap.
        HashMap constructor creates an empty Map
        Generic, allowing my mpa to store data in a given class
        types String, Integer, Boolean etc


        TreeMap is used to sort entries based on keys
        It ensures that the entries are maintained in an ascending key order.
        */


public class Maps {

    public static void main(String[] args) {
        
        //solution:1
        Map<String, Integer> mp = new HashMap<>();//create an empty map
        
        //put key : values
        mp.put("John", 57);
        mp.put("Lisa", 70);
        mp.put("Kim", 69);
        mp.put("Luke", 89);
        mp.put("Jessica", 68);
        
        //System.out.println(mp);//this works but use for each loop
        
        //for each loop to iterate over a Map
        for(Map.Entry<String, Integer> entr : mp.entrySet()){
            System.out.println(entr.getKey() + " : "+ entr.getValue());
        }
        
        //retrieve the mark of john
        System.out.println("Mark of john is: "+mp.get("John"));
        
        //check if alex exist
        if(mp.containsKey("Alex")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //total number of students
        System.out.println(mp.size());
        System.out.println("\n");
        //--------------------------------------------
        
        /*
        Problem 2: Employee Directory (HashMap)
        Store:

        101 -> John
        102 -> Alex
        103 -> Sarah
        104 -> Mike
        */
        
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(101, "john");
        map3.put(102, "alex");
        map3.put(103, "sarah");
        map3.put(104, "mike");
        
        System.out.println("employees: "+ map3);
        
        System.out.println("Employee at 103: "+map3.get(103));
        
        System.out.println("Employee: " + map3.remove(102)+ " removed");
        
        System.out.println("Employees: "+ map3);
        
        System.out.println("\n");
        //------------------------------------------
        
        /*
        solution 3
        
        */
        Map<String, Double> tree = new TreeMap<>();
        
        //insert all products
        tree.put("bread", 15.50);
        tree.put("milk", 20.00);
        tree.put("eggs", 45.99);
        tree.put("sugar", 30.50);
        
        System.out.println("products and prices: "+tree);
        System.out.println("price of milk is: "+ tree.get("milk"));
        System.out.println("\n");
        //---------------------------------------
        
        
        /*
        solution 4
        Exam Rankings (TreeMap)
        
        */
        Map<Integer, String> tree2 = new TreeMap<>();
        
        //store rankings
        tree2.put(95, "sarah");
        tree2.put(88, "john");
        tree2.put(76, "alex");
        tree2.put(99, "mike");
        tree2.put(92, "david");
        
        System.out.println(tree2.keySet());
        
        
        
        
    }
}
