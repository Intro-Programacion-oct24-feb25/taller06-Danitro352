/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario Win11
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String tipo;
        String propietario;
        int valorC;
        double peaje;
        
        System.out.println("Ingrese el nombre del propietario:");
        propietario = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de vehiculo");
        tipo = entrada.nextLine();
        tipo = tipo.toLowerCase();
        
        System.out.println("ingrese el valor del vehiculo");
        valorC = entrada.nextInt();
        
        switch(tipo){
            case "tipo 1":
                tipo = "vehiculo liviano particular";
                peaje = (0.0001 * valorC) + 2;
                System.out.printf("Peaje 'Buena via' \n\tPropietario:"
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ",
                        propietario, tipo, valorC, peaje);
                break;
                
            case "tipo 2":
                tipo = "vehiculo grande particular";
                peaje = (0.0002 * valorC) + 2.5;
                System.out.printf("Peaje 'Buena via' \n\tPropietario:"
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ",
                        propietario, tipo, valorC, peaje);   
                break;
            
            case "tipo 3":
                tipo = "taxi";
                peaje = (0.0004 * valorC) + 1.5;
                System.out.printf("Peaje 'Buena via' \n\tPropietario:"
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ",
                        propietario, tipo, valorC, peaje);    
                break;
              
            case "tipo 4":
                tipo = "vehiculo liviano particular";
                peaje = (0.0005 * valorC) + 2.2;
                System.out.printf("Peaje 'Buena via' \n\tPropietario:"
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ",
                        propietario, tipo, valorC, peaje);    
                break;
        }
    }
}
