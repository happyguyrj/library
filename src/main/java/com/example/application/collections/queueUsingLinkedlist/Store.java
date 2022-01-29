package com.example.application.collections.queueUsingLinkedlist;

import java.util.LinkedList;

public class Store {

    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("rahul"));
        queue.add(new Customer("jain"));
        queue.add(new Customer("RJ"));
        System.out.println(queue);

        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        // poll gets first element and removed from queue
        Customer customer = queue.poll();
        customer.serve();
    }
}
