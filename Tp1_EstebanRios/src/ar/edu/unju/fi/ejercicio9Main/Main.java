package ar.edu.unju.fi.ejercicio9Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9Model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int CantProduct = 3;
		
		Producto[] producto = new Producto[CantProduct];
		
		for (int contador = 0 ; contador < CantProduct ; contador ++) {
			System.out.println("\nRegistrando Producto " + (contador+1));
		
			System.out.println("Ingrese el nombre: ");
			String nombre = scanner.next();
			System.out.println("Ingrese el codigo: ");
			String codigo = scanner.next();
			System.out.println("Ingrese el precio: ");
			Double precio = scanner.nextDouble();
			
			producto[contador] = new Producto();
			producto[contador].setNombre(nombre);
			producto[contador].setCodigo(codigo);
			producto[contador].setPrecio(precio);
		
		}
		
		for (int contador = 0 ; contador < CantProduct ; contador ++) {
				System.out.println("\nMostrando Producto " + (contador+1));
				
				producto[contador].MostrarDatos();
				System.out.println("\nPrecio del Producto" + (contador+1) + "con descuento: " + producto[contador].CalcularDescuento());
				
			}
	scanner.close();
	}

}
