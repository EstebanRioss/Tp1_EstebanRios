package ar.edu.unju.fi.ejercicio6model;

import java.time.LocalDate;
import java.time.Period;

public class Estudiante {
	
	private String Dni;
	private String Nombre;
	private LocalDate FechaDeNac;
	private String Provincia;
	
	public Estudiante () {
		
	}
	
	
	public Estudiante(String dni, String nombre, LocalDate fechaDeNac, String provincia) {
		super();
		Dni = dni;
		Nombre = nombre;
		FechaDeNac = fechaDeNac;
		Provincia = provincia;
	}

	public Estudiante(String dni, String nombre, LocalDate fechaDeNac) {
		super();
		Dni = dni;
		Nombre = nombre;
		FechaDeNac = fechaDeNac;
		Provincia = "Jujuy";
	}

	public int CalcularEdad() {
		
		LocalDate FechaActual = LocalDate.now();
		
		Period periodo = Period.between(this.getFechaDeNac(), FechaActual);
		
		return periodo.getYears();
		
	}
	
	public void MayorDeEdad() {
		int edad = this.CalcularEdad();
		if (edad < 18 ) {
			System.out.println("Es menor de edad");
		}
		else {
			System.out.println("Es mayor de edad");
		}
	}
	
	public void MostrarDatos() { 
		System.out.println("El Dni es: " + this.getDni() + "\nEl nombre es: " + this.getNombre() + "\nLa fecha de nacimiento es: " + this.getFechaDeNac() + "\nSu provincia es: " + this.getProvincia());
		this.MayorDeEdad();
	}


	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFechaDeNac() {
		return FechaDeNac;
	}

	public void setFechaDeNac(LocalDate fechaDeNac) {
		FechaDeNac = fechaDeNac;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	
	
	
}
