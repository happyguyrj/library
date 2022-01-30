package com.example.application.oops.abstraction.interfaceExample;

public class Main {

    public static void main(String[] args) {
        Vehicle.callMeWithoutObject();

        Cycle bicycle = new Cycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.display();

        System.out.println("Bicycle present state :");
        bicycle.printStates();
        System.out.println();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        bike.display();

        System.out.println("Bike present state :");
        bike.printStates();
    }
}
