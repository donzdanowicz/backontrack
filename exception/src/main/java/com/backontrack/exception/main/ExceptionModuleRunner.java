package com.backontrack.exception.main;

import com.backontrack.exception.io.FileReader;
import com.backontrack.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file!");
//        }

//        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
//        fileReader.readFile();
    }
}
