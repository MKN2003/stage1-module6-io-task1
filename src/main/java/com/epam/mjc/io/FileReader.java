package com.epam.mjc.io;

import java.io.*;


public class FileReader {
    public Profile getDataFromFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        return new Profile();
    }
    public static void main(String[] args) {
    }
}
