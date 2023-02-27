package com.museocentralcompensar.entities;

import javax.swing.*;

public class categoritation {


    public static double paymentCategory(JSpinner CategoryField) {
        Object category = CategoryField.getValue();
        String message;
        double pay = 30000;
        if (category instanceof String) {
            switch (category.toString()){
                case "A":
                  pay= pay*0.85;

                    break;
                case "B":
                    pay= pay*0.7;
                    break;
                case "C":
                    pay= pay*0.5;
                    break;
                case "N":
                    //pay no se modifica:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Categoría inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al obtener la categoría.");
        }

        return pay;
    }

    public static double paymentCategoryAge(int age) {
        double pay = 30000;
        if (age < 18){

            pay -= 25000;
        }

        return pay;
    }
}