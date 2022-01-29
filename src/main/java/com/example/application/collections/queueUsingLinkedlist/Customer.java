package com.example.application.collections.queueUsingLinkedlist;

public class Customer {

    private boolean hasBeenServed;
    private String name;

    public Customer(String name) {
        this.name = name;
        hasBeenServed = false;
    }

    public void serve() {
        hasBeenServed = true;
        System.out.println(name + "has been served");
    }

    @Override
    public String toString() {
        return name;
    }
}
