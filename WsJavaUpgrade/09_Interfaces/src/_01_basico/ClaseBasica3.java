package _01_basico;

/**
 * En Java no se puede realizar herencia multiple entre clase
 * Pero, una manera de implementar la herencia multiple en Java
 * es mediante Interfaces
 * 
 * Mientras que una clase en Java SOLO puede extender de UNA SOLA
 * clase,puede implementar N interfaces
 * 
 * De hecho puede extender de una clase e implementar N interfaces
 */
public class ClaseBasica3 extends Object implements InterfaceBasica2, InterfaceBasica1{

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub

	}

	// No hay ningun problema porque este metodo este
	// en dos interfaces, ya que ninguna esta implementado
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodo2(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int operacion(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
