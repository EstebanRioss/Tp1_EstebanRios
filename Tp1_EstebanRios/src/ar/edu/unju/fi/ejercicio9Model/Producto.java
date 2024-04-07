package ar.edu.unju.fi.ejercicio9Model;

public class Producto {
		private String Nombre;
		private String Codigo;
		private Double Precio;
		private int Descuento = (int) (Math.random() * 50) + 1;
		
		public Producto() {
			
		}
		
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getCodigo() {
			return Codigo;
		}
		public void setCodigo(String codigo) {
			Codigo = codigo;
		}
		public Double getPrecio() {
			return Precio;
		}
		public void setPrecio(Double precio) {
			Precio = precio;
		}
		public int getDescuento() {
			return Descuento;
		}
		
		public int CalcularDescuento() {
			return (int) (this.getPrecio() - (this.getPrecio() * this.getDescuento())/100);
		}
		
		public void MostrarDatos(){
			System.out.println("\nNombre del producto: " + this.getNombre());
			System.out.println("\nPrecio del producto: " + this.getPrecio());
			System.out.println("\nCodigo del producto: " + this.getCodigo());
		}
		
}
