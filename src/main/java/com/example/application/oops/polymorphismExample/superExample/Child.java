package com.example.application.oops.polymorphismExample.superExample;

public class Child extends Parent{
    private int num = 2;

    Child(){
        super();    // to call default parent constructor
    }

    void printNum(){
        System.out.println(num);
        System.out.println(super.num); //prints the value of num of parent class
    }

    @Override
    public void foo(){
        System.out.println("Parent class foo!");
        super.foo();    //Calls foo method of Parent class inside the Overridden foo method of Child class.
    }
}