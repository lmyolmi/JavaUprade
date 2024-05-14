package _04_basico.vehiculos;

public class Moto extends VehiculoTerrestre {

	@Override
	public void moverseLento() {
		double movimiento = 300 - (getPeso()*0.10);
		System.out.println("Soy una moto y me muevo " + movimiento);
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 400 - (getPeso()*0.10);
		System.out.println("Soy una moto y me muevo " + movimiento);
		
	}

}
