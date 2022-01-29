package com.example.application.multithreading.threadExample;

public class Main {

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());

        ThreadExample threadExample1 = new ThreadExample();
        threadExample1.setName("First thread");
        threadExample1.start();

        ThreadExample threadExample2 = new ThreadExample();
        threadExample2.setName("Second thread");
        threadExample2.start();
    }
}
