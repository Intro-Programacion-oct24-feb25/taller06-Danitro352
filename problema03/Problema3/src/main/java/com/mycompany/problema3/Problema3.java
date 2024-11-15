/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema3;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario Win11
 */
public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String tipoEmpleado;
        double sueldoInicial;
        double aumento = 0;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese que tipo de empleado es");
        tipoEmpleado = entrada.nextLine();

        System.out.println("Ingrese su sueldo");
        sueldoInicial = entrada.nextDouble();

        
        switch (tipoEmpleado) {
            case "1":
                aumento = (sueldoInicial * 0.05);
                break;

            case "2":
                aumento = (sueldoInicial * 0.07);
                break;

            case "3":
                aumento = (sueldoInicial * 0.09);
                break;

            case "4":
                aumento = (sueldoInicial * 0.12);
                break;

            case "5":
                aumento = (sueldoInicial * 0.15);
                break;
           }
        
         double nuevoSueldo = sueldoInicial + aumento;


           System.out.printf("Nombre:%s\nSu sueldo inicial es: %.2f\n"
                   + "El aumento de su sueldo es: %.2f\nSu nuevo sueldo es:"
                   + "%.2f\n",
                   nombre,
                   sueldoInicial,
                   aumento,
                   nuevoSueldo);
            

        }

    }

