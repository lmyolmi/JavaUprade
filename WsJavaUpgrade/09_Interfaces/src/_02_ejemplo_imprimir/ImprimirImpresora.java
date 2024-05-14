package _02_ejemplo_imprimir;

import _01_basico.Imprimible;

public class ImprimirImpresora implements Imprimible {

	@Override
	public void imprimir(String cadena) {
		String IP = "192.168.40.1"; // Supongamos que la impresora esta aqui
		// Simulamos la impresion por impresora
		System.out.println("Imprimiendo por impresora : " + cadena);
		
		
	}

}
