package com.example.application.oops.abstraction.abstractClassExample;

public class Main {
    public static void main(String[] args) {
        // compiler error as the line tries to create an instance of abstract class.
        // Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
