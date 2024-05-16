package ejemplos;

public class Mander extends Muniemon implements IAgua{
	

	@Override
	public void curar() {
		this.setVida(this.getVida() + 5 );
		
	}

	@Override
	public void curar(Muniemon m) {
		m.setVida(m.getVida() + 5);
		
	}

	@Override
	public void mojar(Muniemon m) {
		System.out.println("Te mojo! " + m.getNombre());
	}

	
	@Override
	public String toString() {
		return "Mander [nombre=" + nombre + ", getVida()=" + getVida() + ", getNombre()=" + getNombre()
				+ ", toString()=" + super.toString() +  "]";
	}
	
	

}
