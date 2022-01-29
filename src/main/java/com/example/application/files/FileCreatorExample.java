package com.example.application.files;

import java.io.File;
import java.io.IOException;

public class FileCreatorExample {

    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean fileCreated = file.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException e) {

        }
    }
}
