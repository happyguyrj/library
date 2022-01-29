package com.example.application.multithreading.runnableExample;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(new RunnableExample() {
            @Override
            public void run() {
                int i = 1;
                while (i < 100) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
            }
        });
        thread2.start();

        Thread thread3 = new Thread(() -> {
                int i = 1;
                while (i < 100) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
        });
        thread3.start();
    }
}
