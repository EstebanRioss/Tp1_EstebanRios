package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int producto,multiplicador;
		
		System.out.println("Ingrese un numero entre el 1 al 9: ");
		
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			if(num1<1 || num1 > 9) {
				System.out.println("Solo calcula con numeros del 1 al 9 !");
			}
			else {
				for(multiplicador = 0; multiplicador < 11; multiplicador++) {
					producto = num1 *multiplicador;
					System.out.println(num1 +" x "+ multiplicador + " = " + producto);
					
					}
				 }
			
				scanner.close();
			}
			else {
			System.out.println("Se ingreso datos incorrectos");
		}

	}

}
