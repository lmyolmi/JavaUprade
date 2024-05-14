package _02_basico;

public class Barco extends Vehiculo {
	private boolean esPirata;
	

	public boolean isEsPirata() {
		return esPirata;
	}

	public void setEsPirata(boolean esPirata) {
		this.esPirata = esPirata;
	}

	
	
	/**
	 * Como la clase barco tiene atributos especificos, vamos a sobreescribir
	 * el metodo "TOSTRING()" para que nos muestre dichos atributos
	 */
	
	@Override
	public String toString() {
		return "Barco [esPirata=" + esPirata + ", getMarca()=" + getMarca() + ", Peso=" + getPeso()
				+ ", Velocidad= " + getVelocidad() + ", FechaFabricacion = " + getFechaFabricacion() + "]";
	}
	
	
	
}
