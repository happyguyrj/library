package com.example.application;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        // without generics
        List names = new ArrayList<>();
        names.add("Rahul");
        String name = (String) names.get(0);
        System.out.println(name);

        // with generics
        // without generics
        List<String> namesList = new ArrayList<>();
        namesList.add("Rahul");
        String nameFromList = namesList.get(0);
        System.out.println(nameFromList);
    }
}
