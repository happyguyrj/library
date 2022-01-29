package com.example.application.progamming.functional.stream;

import java.util.ArrayList;

public class Main {

    public static void main(String[] arg) {
        ArrayList<Book> books = populateLibrary();
        books.stream()
                .filter(book -> book.getName().startsWith("T"))
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("5 am club", "Robin Sharma"));
        books.add(new Book("Rich dad poor dad", "Robert Kiyosaki"));
        books.add(new Book("How to make friends", "Dale Carnige"));
        books.add(new Book("The Intelligent Investor", "Benjamin Grahm"));
        books.add(new Book("The richest man in bablylon", "George Samuel Clason"));
        books.add(new Book("Eat that frog", "Brain Tracy"));
        books.add(new Book("The man who sold his Ferrari", "Robin Sharma"));
        return books;
    }
}
