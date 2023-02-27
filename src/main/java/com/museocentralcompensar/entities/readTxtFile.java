package com.museocentralcompensar.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class readTxtFile {

    Scanner scanner;
    public static Set<String> fileContent = new HashSet<>();

    public readTxtFile(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.equals("")) {
                fileContent.add(line);
            }
        }
    }

    public Set<String> getFileContent() {
        return fileContent;
    }
}