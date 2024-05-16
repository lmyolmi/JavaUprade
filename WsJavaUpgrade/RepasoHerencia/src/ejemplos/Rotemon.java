package ejemplos;

public class Rotemon extends Muniemon implements IAgua, IElectrico {

	private boolean haMojado;
	
	@Override
	public void paralizar(Muniemon m) {
		if(this.haMojado == true) {
			System.out.println("No puedo paralizar");
		}else {
			System.out.println("Te paralizo");
		}
		
	}

	@Override
	public void churrascar(Muniemon m) {
	if(this.haMojado == true) {
		m.setVida(getVida() -20 );
		}else {
			m.setVida(getVida() - 10);
		}
		
	}

	@Override
	public void curar() {
	
		
	}

	@Override
	public void curar(Muniemon m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mojar(Muniemon m) {
		System.out.println("Te mojo! " + m.getNombre());
		this.haMojado = true;
		
	}

}
