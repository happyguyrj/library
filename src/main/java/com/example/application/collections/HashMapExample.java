package com.example.application.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Rahul", 123);
        phoneBook.put("Jain", 456);
        System.out.println(phoneBook);

        phoneBook.put("Rahul", 789);
        System.out.println(phoneBook);

        phoneBook.put(null, 0);
        if (phoneBook.containsKey("Rahul")) {
            phoneBook.put("Rahul new", 123);
        }

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
