package ar.edu.unju.fi.ejercicio10Model;

public class Pizza {
	private int Diametro;
	private double Precio;
	private double Area;
	private boolean IngreEspec;
	private final double IngreEspec20 = 500.0;
	private final double IngreEspec30 = 500.0;
	private final double IngreEspec40 = 500.0;
	
	public Pizza() {

	}
	public int getDiametro() {
		return Diametro;
	}
	public void setDiametro(int diametro) {
		Diametro = diametro;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area = area;
	}
	public boolean isIngreEspec() {
		return IngreEspec;
	}
	public void setIngreEspec(boolean ingreEspec) {
		IngreEspec = ingreEspec;
	}
	
	public void CalcularPrecio() {
		switch(this.getDiametro())
		{
		case 20:
			if (this.isIngreEspec() == true) {
				this.setPrecio(4500 + this.IngreEspec20);
			}
			else {
				this.setPrecio(4500);
			}
			
		case 30:
			if (this.isIngreEspec() == true) {
				this.setPrecio(4800 + this.IngreEspec30);
			}
			else {
				this.setPrecio(4800);
			}
			
			
		case 40:
			if (this.isIngreEspec() == true) {
				this.setPrecio(5500 + this.IngreEspec40);
			}
			else {
				this.setPrecio(5500);
			}	
		}
	}
	
	public void CalcularArea() {
		this.setArea(Math.PI * Math.pow(this.getDiametro()/2,2));
	}
	
	public void MostrarDatos() {
		System.out.println("\nDiametro: " + this.getDiametro());
		System.out.println("\nIngredientes especiales: " + this.isIngreEspec());
		System.out.println("\nPrecio Pizza: " + this.getPrecio());
		System.out.println("\nArea de la pizza: " + this.getArea());
	}
	
}
