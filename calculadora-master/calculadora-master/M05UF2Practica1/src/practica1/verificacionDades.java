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

    static boolean gestor(String numero1, String numero2, String opreacion) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        boolean comprobar = false;
        String operacion = "";

        do {
            if (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);
            double n1 = new Double(numero1);

            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                    || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                    || operacion.equals("*")) {
                comprobar = false;

                if (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                double nume2 = Double.parseDouble(numero2);
                double n2 = new Double(numero2);
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X")) {
                    comprobar = false;
                }

                while (operacion.equals("/") || operacion.equals("%")) {
                    if (!comprobar) {

                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            nume2 = Double.parseDouble(numero2);
                            n2 = new Double(numero2);
                        }
                    }
                    comprobar = true;
                }
            }
        } while (comprobar);
        return comprobar;
    }

}
