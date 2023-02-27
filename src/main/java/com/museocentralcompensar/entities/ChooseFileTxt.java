package com.museocentralcompensar.entities;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ChooseFileTxt extends Component  {

    public static File selectedFile;
    //Create a file chooser:
    static final JFileChooser fc = new JFileChooser()
        {@Override
            protected javax.swing.JDialog createDialog(java.awt.Component parent) throws java.awt.HeadlessException {
            javax.swing.JDialog dialog = super.createDialog(parent);
            //change initial directory:
            this.setCurrentDirectory(new java.io.File("E:\\ProgrammingStudy\\Ucompensar\\Semestre II\\Algoritmos y Programación II\\Profundización\\MuseoCentralCompensar"));

            dialog.setIconImage(new
                    javax.swing.ImageIcon("E:\\ProgrammingStudy\\Ucompensar\\Semestre II\\Algoritmos y Programación II\\Profundización\\MuseoCentralCompensar\\MuseoCentralCompensar\\Images\\greenICon.png").getImage());

            return dialog;

        }};

    public ChooseFileTxt() throws FileNotFoundException {
        ChooseAndFixFileTxt();
    }


    public File ChooseAndFixFileTxt() throws FileNotFoundException {
        //In response to a button click:
        int returnVal = fc.showOpenDialog(this);
         File file = fc.getSelectedFile();
         fc.setDialogTitle("Elige el archivo txt de registros.");
         fc.setFont(new Font("Futura Bk BT", Font.BOLD, 12));

        if (returnVal == JFileChooser.APPROVE_OPTION) {


            //This is where a real application would open the file.



            selectedFile = file;

        } else {
            System.out.println("Open command cancelled by user.");
        }
        return file;
    }


    public static File getSelectedFile() {
        return selectedFile;
    }



}
