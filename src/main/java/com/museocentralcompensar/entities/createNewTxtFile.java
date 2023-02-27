package com.museocentralcompensar.entities;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class createNewTxtFile {
    String iconPath = "E:\\ProgrammingStudy\\Ucompensar\\Semestre II\\Algoritmos y Programación II\\Profundización\\MuseoCentralCompensar\\MuseoCentralCompensar\\Images\\greenICon100px.png";
    ImageIcon icon = new ImageIcon(iconPath);

    PrintWriter outputFile;

    public createNewTxtFile() {
        // Icono
        // Output dialog
        String newFileName = JOptionPane.showInputDialog(null, "Ingrese el nombre del archivo a crear:", "Nuevo archivo", JOptionPane.INFORMATION_MESSAGE, icon, null, null).toString();
        try {
            outputFile = new PrintWriter(newFileName + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println("Hubo un error en la creación del archivo ");
        }

        String newRegister = JOptionPane.showInputDialog(null, "Ingrese el registro a guardar:", "Nuevo registro", JOptionPane.INFORMATION_MESSAGE, icon, null, null).toString();
        outputFile.println(newRegister);
        JOptionPane.showMessageDialog(null, newRegister, "Registro guardado", JOptionPane.INFORMATION_MESSAGE, icon);
        outputFile.close();

    }

    public void closeFile() {
        if (outputFile != null) {
            outputFile.close();
        }
    }
}
