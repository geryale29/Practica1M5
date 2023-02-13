/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Karla Cubias
 */
public class verificacionDades {

    static double gestor(double n2) {
        Scanner sc = new Scanner(System.in);
        String numero2 = "";
        double nume2;
        while (n2 == 0) {
            do {
                System.err.println(" Al denominador hi ha un zero \n"
                        + "per a  evitar errors coloca un altre valor.");
                numero2 = sc.nextLine();
            } while (numero2.equalsIgnoreCase("0"));
            n2 = new Double(numero2);
        }
        return n2;
    }

}
