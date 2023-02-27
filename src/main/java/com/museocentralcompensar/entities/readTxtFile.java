package com.museocentralcompensar.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTxtFile {

    Scanner scanner;
    public static String fileContent = ""; //Variable global

    public readTxtFile(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (fileContent.equals("")) {
                fileContent += line;
            } else {
                fileContent += "\n" + line; //Agregar cada línea del archivo a la variable global
            }
        }
    }

    public String getFileContent() {
        return fileContent;
    }
}