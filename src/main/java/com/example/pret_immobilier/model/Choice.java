package com.example.pret_immobilier.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Choice {

   private static final List<Integer> listRates = new ArrayList<Integer>();

    static {
        listRates.addAll(Arrays.asList(30,40, 50, 60, 70) );
    }



   public Choice() {

   }


    public static List<Integer> getListRates() {
        return listRates;
    }
}