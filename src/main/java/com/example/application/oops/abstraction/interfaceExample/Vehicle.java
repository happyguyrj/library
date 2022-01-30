package com.example.application.oops.abstraction.interfaceExample;

public interface Vehicle {

    int topSpeed = 40;

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    default void display() {
        System.out.println("Vehicle");
    }

    static void callMeWithoutObject() {
        System.out.println("Hello!");
    }

}
