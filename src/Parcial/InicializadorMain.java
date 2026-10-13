/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

import java.util.Scanner;

/**
 *
 * @author kenic
 */
public class InicializadorMain {
   
    public static void main(String[] args) {
        CalculadoraMatematica calcular = new CalculadoraMatematica();
        Scanner s = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("==== Calculadora Matematica ====");
        System.out.println("1. Ingresar numeros: ");
        System.out.println("2. Sumar: ");
        System.out.println("3. Restar: ");
        System.out.println("4. Multiplicar: ");
        System.out.println("5. Dividir: ");
        System.out.println("0. Salir: ");
        System.out.println("================================");
        System.out.println("Selecciona una opcion: ");
        opcion = s.nextInt();
        int a = 0;
        int b = 0;
            switch (opcion) {
                case 1:
                    calcular.IngresarNumero(a,b);
                    
                    /*El for es para poder limpiar un poco la pantalla*/
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                       
                    }
                    
                    break;
                    
                case 2: 
                    System.out.println("La suma es igual a: "+ calcular.sumar(a,b));
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                       
                    }
                    break;
                case 3: 
                    System.out.println("La resta es igual a: "+ calcular.restar(a,b));
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                       
                    } 
                    break;
                case 4:  
                    System.out.println("La multiplicacion es igual a: "+ calcular.multiplicar(a,b));
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                       
                    }
                   
                    break;
                    
                case 5:  
                    System.out.println("La division es igual a: "+ calcular.dividir(a,b));
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                       
                    }
                    break;

                default:
                    System.out.println("");
            }
        } while (opcion != 0);
    }
}
