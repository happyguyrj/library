package com.example.application.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Rahul");
        linkedList.add("Jain");
        linkedList.add(0, "Mr");

        System.out.println(linkedList);
        linkedList.remove("Jain");

        // takes more memory than arraylist
        // inserting removing elements from middle of list is faster in linkedlist
        // getting element from list is faster in arraylist
    }
}
