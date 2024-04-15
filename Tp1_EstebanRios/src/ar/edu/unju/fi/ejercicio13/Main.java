package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int CantElem = 8;
		int[] Array = new int[CantElem];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < CantElem ; i++ ){
			Array[i] = scanner.nextInt();
		}
		for(int i = 0 ; i < CantElem ; i++ ){
			System.out.println("En el indice " + (i+1) + " esta almacenado el valor: " + Array[i]);
		}
		scanner.close();
	}

}
