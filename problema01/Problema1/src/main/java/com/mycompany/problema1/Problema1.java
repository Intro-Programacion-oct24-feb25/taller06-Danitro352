/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Daniel Idrovo, Adrian Urgiles
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese la primera cantidad");
        double num1 = entrada.nextDouble();

        System.out.println("Ingrese el operador");
        entrada.nextLine();
        String operador = entrada.nextLine();

        double operacion = 0;

        System.out.println("Ingrese la segunda cantidad");
        double num2 = entrada.nextDouble();

        if (num1 > num2) {
            switch (operador) {
                case "+":
                    operacion = (num1 + num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;

                case "-":
                    operacion = (num1 - num2);
                    System.out.printf("El resiultado es: %.2f", operacion);
                    break;

                case "*":
                    operacion = (num1 * num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;

                case "/":
                    operacion = (num1 / num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;

                case "MOD":
                    operacion = (num1 % num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;

                case "^":
                    operacion = (Math.pow(num2, num2));
                    System.out.printf("El resultado es: %.2f", operacion);

            }
        }
    }
}
