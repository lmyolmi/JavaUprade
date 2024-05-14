package _04_basico.animales;

public class Tiburon extends Pez {

	@Override
	public void comer(Object o) {
		// super es una refencia a la clase Padre.
		// super.comer(o);
		if(o instanceof Pez) {
			Pez pez = ((Pez) o);
			double PesoGanado = pez.getPeso() *0.30; // Aqui si aplicamos polimorfimos 
			this.setPeso(this.getPeso() + PesoGanado);
			System.out.println("Soy el tiburon " + this.getNombre() + " y me voy a comer al pez " + pez.getNombre());
			
		}else {
			System.out.println("Soy un tiburon y solo como peces.");
		}
	}
	

}
