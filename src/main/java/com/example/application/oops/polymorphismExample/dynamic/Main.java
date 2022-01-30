package com.example.application.oops.polymorphismExample.dynamic;

public class Main {
    public static void main(String[] args) {
        Parent a;

        a = new Subclass1();
        a.print();

        a = new Subclass2();
        a.print();
    }
}
