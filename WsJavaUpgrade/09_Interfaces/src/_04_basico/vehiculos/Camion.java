package _04_basico.vehiculos;

public class Camion extends VehiculoTerrestre {

	@Override
	public void moverseLento() {
		double movimiento = 10 - (getPeso()*0.90);
		System.out.println("Soy un Camion y me muevo " + movimiento);
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 20- (getPeso()*0.90);
		System.out.println("Soy un Camion y me muevo " + movimiento);
		
	}

}
