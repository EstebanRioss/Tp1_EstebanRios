package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño que este dentro del rango [3-8] del array: ");
		int Cant = scanner.nextInt();
		if (Cant > 3 && Cant <8) {
			int[] Array = new int[Cant];
			for(int i = 0 ; i < Cant ; i++ ){
				Array[i] = scanner.nextInt();
			}
			
			for(int i = 0 ; i < Cant ; i++ ){
				System.out.println("En el indice " + (i+1) + " esta almacenado el valor: " + Array[i]);
			}
			int SumaT = 0;
			for(int i = 0 ; i < Cant ; i++ ){
				SumaT += Array[i];
			}
			System.out.println("La suma total es: " + SumaT);
		}
		else {
			System.out.println("Fuera del rango");
		}
		
		
		scanner.close();
	}

}
