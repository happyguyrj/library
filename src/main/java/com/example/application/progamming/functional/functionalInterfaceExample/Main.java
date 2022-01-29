package com.example.application.progamming.functional.functionalInterfaceExample;

// lambda represent implementation of a functional interface
// Functional interface allow code around to pass as data
// functional interface is a interface which has only one method

public class Main {

    public static void main(String[] arg) {

        // here greeting message is anonymous class
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        greetingMessage.greet("Rahul");
    }
}
