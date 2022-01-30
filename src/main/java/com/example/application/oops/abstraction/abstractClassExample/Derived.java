package com.example.application.oops.abstraction.abstractClassExample;

public class Derived extends Base{

    Derived() {
        System.out.println("Derived Constructor Called");
    }

    @Override
    void fun() {
        System.out.println("Derived fun() called");
    }
}
