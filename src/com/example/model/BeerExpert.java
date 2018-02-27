package com.example.model;

import java.util.*;
public class BeerExpert {
    public static List getBrands(String color){
        List brand=new ArrayList();
        if (color.equals("amber")){
            brand.add("Jack Amber");
            brand.add("Red Moose");
        }
        else {
            brand.add("Jail Pale Ale");
            brand.add("Gout Stout");
        }
        return brand;
    }
}
