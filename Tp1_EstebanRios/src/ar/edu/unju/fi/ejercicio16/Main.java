package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];


        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Nombres ingresados:");
        int indice = 0;
        while (indice < nombres.length) {
            System.out.println("Nombre " + (indice + 1) + ": " + nombres[indice]);
            indice++;
        }


        System.out.println("Tamaño del array: " + nombres.length);


        byte indiceEliminar;
        do {
            System.out.println("Ingrese el índice del elemento a eliminar:");
            indiceEliminar = scanner.nextByte();

        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);


        for (int i = (int) indiceEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null; 

    
        System.out.println("Array después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}