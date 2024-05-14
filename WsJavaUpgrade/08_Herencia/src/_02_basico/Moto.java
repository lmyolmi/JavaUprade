package _02_basico;

public class Moto extends VehiculoTerrestre {
	private tipoMoto tipo;

	public tipoMoto getTipo() {
		return tipo;
	}

	public void setTipo(tipoMoto tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moto [tipo=" + tipo + ", getMatricula()=" + getMatricula() + ", getNumeroRuedas()=" + getNumeroRuedas()
				+ ", getMarca()=" + getMarca() + ", getPeso()=" + getPeso() + ", getVelocidad()=" + getVelocidad()
				+ ", getFechaFabricacion()=" + getFechaFabricacion() + "]";
	}
	
	

}
