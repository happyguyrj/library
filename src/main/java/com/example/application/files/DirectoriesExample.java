package com.example.application.files;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoriesExample {

    public static void main(String[] args) {
        // list contents for folder
        String[] contents = new File(".").list();
        for (String content : contents)
            System.out.println(content);

        new File("newDirectory").mkdir();

        // filtering files
        FilenameFilter filenameFilter = (file, fileName) -> {
            return fileName.contains(".");
        };

        // handling paths
        Path path = Paths.get("Example.txt");
        try {
            System.out.println(path.getParent());
            System.out.println(path.getRoot());
            System.out.println(path.getFileName());

            Files.deleteIfExists(path);
        } catch (Exception e) {

        }

        Path sourcePath = Paths.get("Example.txt");
        Path destPath = Paths.get("Example.txt");
        try {
            Files.copy(sourcePath, destPath);
        } catch (IOException e) {

        }
    }
}
