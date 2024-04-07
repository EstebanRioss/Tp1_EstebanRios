package ar.edu.unju.fi.ejercicio7Model;

public class Empleado {
	private String Nombre;
	private String Legajo;
	private Double Salario;
	private final Double SALARIO_MINIMO = 210000.0;
	private final Double AUMENTO_POR_MERITOS = 20000.0;
	
	
	
	public Empleado(String nombre, String legajo, Double salario) {
		super();
		Nombre = nombre;
		Legajo = legajo;
		if (salario >= SALARIO_MINIMO) {
			Salario = salario;
		}
		else {
			Salario = SALARIO_MINIMO;
		}
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getLegajo() {
		return Legajo;
	}
	public void setLegajo(String legajo) {
		Legajo = legajo;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	public void Mostrar_Datos() {
		System.out.println("\nDATOS DEL EMPLEADO");
		System.out.println("Nombre del empleado: " + this.getNombre());
		System.out.println("Legajo: " + this.getLegajo());
		System.out.println("Salario: " + this.getSalario());
	}
	
	public void AumentoSalario(){
		System.out.println("\nAUMENTO DEL SALARIO");
		this.setSalario(Salario + this.AUMENTO_POR_MERITOS);
	}
	
}
