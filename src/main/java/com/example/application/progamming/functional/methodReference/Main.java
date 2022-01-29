package com.example.application.progamming.functional.methodReference;

// method reference are a short hand way of writing lambda

public class Main {

    public static void main(String[] arg) {

        Square square = new Square(4);
        Shape shape = (Square s) -> {
            return s.calculateArea();
        };
        System.out.println("Area: " + shape.getArea(square));

        Shape shapeUsingMethodRef = Square::calculateArea;
        System.out.println("Area: " + shape.getArea(square));
    }
}
