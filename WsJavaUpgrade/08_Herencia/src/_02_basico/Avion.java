package _02_basico;

public class Avion extends Vehiculo{
	private int numeroAlas;
	
	
	@Override
	public boolean esAntiguo() {
		// Como el atributo 'fechaFabricacion' es private no podemos acceder
		// a el directamente, debemos de usar un "get"
		String Sanio = getFechaFabricacion().split("/")[2];
		int iAnio = Integer.parseInt(Sanio);
		if (iAnio< 2010) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean puedeVolar() {
		if(this.getPeso() < 100000 && this.numeroAlas >=2) {
			return true;
		}else {
			return false;
		}
	}
	public int gerNumeroAlas() {
		return numeroAlas;
	}

	@Override
	public String toString() {
		return "Avion [numeroAlas=" + numeroAlas + ", getMarca()=" + getMarca() + ", getPeso()=" + getPeso()
				+ ", getVelocidad()=" + getVelocidad() + ", getFechaFabricacion()=" + getFechaFabricacion() + "]";
	}
	
	
	
	

}
