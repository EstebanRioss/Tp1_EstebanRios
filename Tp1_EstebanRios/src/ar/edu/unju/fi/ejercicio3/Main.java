package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Por favor ingresa un número entero: ");
	
	int n1 = scanner.nextInt();
	
	if (n1%2 == 0) {
		System.out.println(n1*2);
	}
	else {
		System.out.println(n1*3);
	}
		
	scanner.close();
		
	}
}
