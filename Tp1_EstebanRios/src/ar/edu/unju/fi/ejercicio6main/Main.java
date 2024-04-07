package ar.edu.unju.fi.ejercicio6main;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio6model.Estudiante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String Nombre,Provincia,Dni;
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		
		System.out.println("Ingrese los Datos del estudiante");
		
		Estudiante estudiante1 = new Estudiante();
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		String fecha = scanner.nextLine();
		estudiante1.setFechaDeNac(LocalDate.parse(fecha,formato1));
		System.out.println("Ingrese la provincia: ");
		Provincia = scanner.nextLine();
		
		estudiante1.setDni(Dni);
		estudiante1.setNombre(Nombre);
		estudiante1.setProvincia(Provincia);
		estudiante1.MostrarDatos();
		
		//declaro el segundo estudiante con el metodo parametrizado
		System.out.println("Ingrese los Datos del estudiante");
		
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		fecha = scanner.nextLine();
		System.out.println("Ingrese la provincia: ");
		Provincia = scanner.nextLine();
		
		Estudiante estudiante2 = new Estudiante(Dni,Nombre, LocalDate.parse(fecha,formato1) ,Provincia);
		estudiante2.MostrarDatos();
		
		//Declaro el segundo estudiante con el metodo parametrizado sin provincia
		System.out.println("Ingrese los Datos del estudiante");
		
		System.out.println("Ingrese el nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Ingrese el Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		fecha = scanner.nextLine();
		
		Estudiante estudiante3 = new Estudiante(Dni,Nombre, LocalDate.parse(fecha,formato1));
		estudiante3.MostrarDatos();
		
		scanner.close();
		
	}

}
