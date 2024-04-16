package ar.edu.unju.fi.ejercicio18Model;
import ar.edu.unju.fi.ejercicio18Model.Pais;


public class DestinoTuristico {
	private String Codigo;
	private String Nombre;
	private Double Precio;
	private Pais Pais;
	private int CantDia;
	
	public DestinoTuristico() {
		
	}
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	public Pais getPais() {
		return Pais;
	}
	public void setPais(Pais pais) {
		Pais = pais;
	}
	public int getCantDia() {
		return CantDia;
	}
	public void setCantDia(int cantDia) {
		CantDia = cantDia;
	}
	
	public void MostraDatos(){
		System.out.println("**Mostrar Datos del destino turistico**");
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Cantidad de dias: " + this.getCantDia());
		System.out.println("Pais: " + (this.getPais()).getNombre());
	}
	
}
