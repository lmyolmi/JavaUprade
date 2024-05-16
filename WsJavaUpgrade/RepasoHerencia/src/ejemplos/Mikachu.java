package ejemplos;

public class Mikachu extends Muniemon implements IElectrico {
	private int numeroColas;

	public int getNumeroColas() {
		return numeroColas;
	}

	public void setNumeroColas(int numeroColas) {
		this.numeroColas = numeroColas;
	}

	@Override
	public String toString() {
		return "Mikachu [numeroColas=" + numeroColas + "]";
	}

	@Override
	public void paralizar(Muniemon m) {
		System.out.println("Ay! Que te paralizo! :3 " + m.nombre );
		
	}

	@Override
	public void churrascar(Muniemon m) {
		m.setVida(m.getVida()-10);
		
	}
	
	

}
