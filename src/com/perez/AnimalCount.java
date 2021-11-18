package com.perez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalCount {


    public static void processData(ArrayList<String> list) {

        //Create a HashMap instance variable that uses Strings for keys and Integers for values.
        // create a processData method that uses the Map object to count the number of each type of animal.
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hashMap.get(i);
            hashMap.put(i, (j == null) ? 1 : j + 1);


            for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
                System.out.println("Element " + val.getKey() + " "
                        + "occurs"
                        + ": " + val.getValue() + " times");
            }
        }

       /*public static void printReport() {
            System.out.println("--- Animal Report ---");
            for(

            );*/

            }

    }



