/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author esther
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0, n1 = 0, n2 = 0;
        String operacion, numero1, numero2;
        boolean comprobar = false;

        do {
            System.out.println("\n Introdueix el primer numero. ");
            numero1 = sc.nextLine();

            System.out.println("\nIndica el signo de la "
                    + "operacion que deseas realizar");
            System.out.println("+ = sumar \n "
                    + "- = restar \n"
                    + " x = multiplicar \n "
                    + "/ = dividir \n "
                    + "* = elevar primer num al segon num."
                    + "\n % = residu");
            operacion = sc.nextLine();

            System.out.println("\n Introdueix el segon numero.");
            numero2 = sc.nextLine();

            switch (operacion) {

                case "+":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        calculadora.suma(n1, n2);
                    }
                    break;

                case "-":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        res = calculadora.resta(n1, n2);
                    }
                    break;
                case "x":
                case "X":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        res = calculadora.multiplicacion(n1, n2);
                    }
                    break;

                case "/":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        res = calculadora.division(n1, n2);
                    }
                    break;

                case "*":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        res = Math.pow(n1, n1);
                    }
                    break;

                case "%":
                    if (verificacionDades.gestor(numero1, numero2, operacion)) {
                        res = calculadora.modulo(n1, n2);
                    }
                    break;
            }

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\n Vols continuar operant? \n");
            System.out.println(" [s/n]");
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                        break;
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, posa un valor vàlid. \n");
                        comprobar = false;
                }
            } while (comprobar != true);

        } while (operacion.equals("s") || operacion.equals("S"));
    }

}
