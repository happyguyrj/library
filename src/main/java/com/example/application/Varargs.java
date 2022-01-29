package com.example.application;

public class Varargs {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Orange";
        String item3 = "Pears";

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Bananas"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shoppingList);
    }

    public static void printShoppingList(String... item) {
        System.out.println("\nShopping list");
        for (String s : item) {
            System.out.println(s);
        }
    }
}
