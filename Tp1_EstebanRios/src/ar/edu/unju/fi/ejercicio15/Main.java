package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño que este dentro del rango [5-10] del array: ");
        int Cant = scanner.nextInt();
        

        if (Cant > 5 && Cant < 10) {
            String[] Array = new String[Cant];

            System.out.println("Ingrese " + Cant + " caracteres:");

            String entrada = scanner.next();

            if ( entrada.length() == Cant) {
                for (int i = 0; i < Cant; i++) {
                    Array[i] = Character.toString(entrada.charAt(i));
                }
                System.out.println("Palabra en Orden Normal");
                for (int i = 0; i < Cant; i++) {
                	
                    System.out.println("En el indice " + i + " esta almacenado el valor: " + Array[i]);
                }
                System.out.println("Palabra Al revez");
                for (int i = Array.length - 1; i >= 0; i--) {
                	
                    System.out.println("En el indice " + i + " esta almacenado el valor: " + Array[i]);
                }
            }
            else {
            	System.out.println("Palabra fuera del rango");
            }
        } else {
            System.out.println("Fuera del rango");
        }

     scanner.close();   
    }
}
