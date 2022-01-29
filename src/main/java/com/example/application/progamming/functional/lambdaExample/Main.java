package com.example.application.progamming.functional.lambdaExample;

// lambda provide simple way of implementation of a functional interface

public class Main {

    public static void main(String[] arg) {

        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        greetingMessage.greet("Rahul");

        GreetingMessage greeting = (String name) -> {
            System.out.println("Hello " + name);
        };

        greeting.greet("Rahul");

        MessagePrinter messagePrinter = () -> System.out.println("This is a message");
        messagePrinter.printMessage();
    }
}
