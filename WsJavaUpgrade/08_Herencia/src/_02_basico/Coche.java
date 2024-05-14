package _02_basico;

public class Coche extends VehiculoTerrestre {
	private int numeroPuertas;

	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", getMatricula()=" + getMatricula() + ", getNumeroRuedas()="
				+ getNumeroRuedas() + ", getMarca()=" + getMarca() + ", getPeso()=" + getPeso() + ", getVelocidad()="
				+ getVelocidad() + ", getFechaFabricacion()=" + getFechaFabricacion() + "]";
	}
	
	
	
	

}
