package ejemplos2;

public class Curandero extends Personaje {
	private int sabiduria;

	@Override
	public void atacar(Personaje p) {
		int danio = this.getArma().getDanio();
		if(this.getArma() instanceof Rezo) {
			danio += this.sabiduria;
		}
		p.setVida(p.getVida() - danio);
		
	}
		
	}
	
	
