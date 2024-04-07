package ar.edu.unju.fi.ejercicio10Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10Model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		int CantProduct = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		Pizza[] pizza = new Pizza[CantProduct];
		
		for (int contador = 0 ; contador < CantProduct ; contador ++) {
			pizza[contador] = new Pizza();
			
			System.out.println("\nIngrese las especificaciones de la pizza " + (contador+1));
			
			System.out.println("\nIngrese el diamtero de la pizza: ");
			int diametro = scanner.nextInt();
			if(diametro == 20 || diametro == 30 || diametro == 40) {
				pizza[contador].setDiametro(diametro);
			}else {
				System.out.println("\nNo hay pizza de ese diametro");
				System.exit(0);
			}
			System.out.println("\nDesea ingrediente especiales (true/false):");
			String IngreEspec = scanner.next();
			if (IngreEspec == "true") {
				pizza[contador].setIngreEspec(true);
			}
			else {
				pizza[contador].setIngreEspec(false);
			}
			
			pizza[contador].CalcularPrecio();
			pizza[contador].CalcularArea();
		}
		
		for (int contador = 0 ; contador < CantProduct ; contador ++) {
			System.out.println("\n**Pizza "+ (contador+1) +"**");
			pizza[contador].MostrarDatos();
		}
		
		
		scanner.close();
	}

}
