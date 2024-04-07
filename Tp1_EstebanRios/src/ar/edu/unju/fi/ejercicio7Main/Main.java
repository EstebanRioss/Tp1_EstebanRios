package ar.edu.unju.fi.ejercicio7Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7Model.Empleado;

public class Main {
	public static void main(String[] args) {
		String nombre,legajo;
		double salario;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CREACION DE UN EMPLEADO");
		System.out.println("Ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Ingrese el Legajo: ");
		legajo = scanner.nextLine();
		System.out.println("Ingrese el salario: ");
		salario = scanner.nextInt();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		empleado.Mostrar_Datos();
		
		empleado.AumentoSalario();
		empleado.Mostrar_Datos();
		
		scanner.close();
	}
}
