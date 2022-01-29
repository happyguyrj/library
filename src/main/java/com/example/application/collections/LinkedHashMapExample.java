package com.example.application.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // initial capacity
        // load factor: increase map size when it is loadFactor full
        // access order: false mean return in which they were inserted in map, true means return in order in which they were accessed
        Map<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, false);
        phoneBook.put("Rahul", 123);
        phoneBook.put("Jain", 456);
        phoneBook.put("RJ", 789);

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // most recently accessed is at last
        // least recently updated is at beginning
        Map<String, Integer> phoneBookInOrderOfAccess = new LinkedHashMap<>(4, 0.75f, true);
        phoneBookInOrderOfAccess.put("Rahul", 123);
        phoneBookInOrderOfAccess.put("Jain", 456);
        phoneBookInOrderOfAccess.put("RJ", 789);
        System.out.println(phoneBookInOrderOfAccess.get("Rahul"));
        for (Map.Entry<String, Integer> entry : phoneBookInOrderOfAccess.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
