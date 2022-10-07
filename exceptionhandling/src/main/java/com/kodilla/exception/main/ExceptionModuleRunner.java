package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading file!");
        }

        try {
            fileReader.readFile2("missing_file.txt");
        } catch (FileReaderException e) {
            System.out.println("File is missing");
        }
    }
}