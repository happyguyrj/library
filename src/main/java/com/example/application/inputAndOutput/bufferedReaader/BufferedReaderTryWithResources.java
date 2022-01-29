package com.example.application.inputAndOutput.bufferedReaader;

import java.io.*;

public class BufferedReaderTryWithResources {

    public static void main(String[] args) {

        try(
                BufferedReader reader = new BufferedReader(new StringReader("Hello World!"));
                StringWriter writer = new StringWriter();
            ) {
            writer.write(reader.readLine());
        } catch (IOException e) {

        }
    }
}
