package _01_basico;

public class ClaseBasica2 implements InterfaceBasica1 {

	@Override
	public void metodo1() {
		System.out.println("Este es el metodo pero de la " + getClass().getSimpleName());
	}

	@Override
	public String metodo2(Object o) {
		String cadena = "Este seria el metodo 2 de la clase " + getClass().getSimpleName() + "que invocamos"
				+ " el metodo toString del objeto object " + o.toString();
		
		return cadena;
	}

	/**
	 * Operacion multiplicación
	 */
	@Override
	public int operacion(int a, int b) {
		int multiplicacion = a*b;
		
		return multiplicacion
				;
	}

}
