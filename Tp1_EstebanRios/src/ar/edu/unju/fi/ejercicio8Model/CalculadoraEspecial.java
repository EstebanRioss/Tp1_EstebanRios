package ar.edu.unju.fi.ejercicio8Model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public long CalcularSumatoria() {
		long sumatoria = 0;
		
		for (int k = 1; k <= this.getN() ; k++) {
			
			sumatoria =+ (int) Math.pow( (k*(k+1))/2,2);
		}
		return sumatoria;
	}
	
	public long CalcularProductoria() {
		long Productoria = 1;
		for (int k = 1 ; k <= this.getN() ; k++){
			Productoria = Productoria*(k*(k+4));
		}
		
		return Productoria;
	}
		
	
}
