package _02_ejemplo_imprimir;

import _01_basico.Imprimible;

public class ImprimirPantalla implements Imprimible {

	@Override
	public void imprimir(String cadena) {
		System.out.println(cadena);
		
	}

}
