package _02_ejemplo_imprimir;

import _01_basico.Imprimible;

public class MainImpresora {

	public static void main(String[] args) {
		// Con una referencia de una interface puedo apuntar a
		// cualquier objeto que implemente la interfaz
		
		// DE HECHO, se considera una buena practica de programacion
		// el orientar tu codigo siempre que se pueda a interfaces
		// asi como utilizar referencias de la interfaz
		// Usar interface para apuntar a objetos hacen que las
		// dependencias de tu codigo sean dependencias DEBILES
		// mientras que usar las referencias propias del objeto
		// hacen que sean dependencias FUERTES
		
		Imprimible impPantalla = new ImprimirPantalla();
		Imprimible impFichero = new ImprimirFichero();
		Imprimible impImpresora = new ImprimirImpresora();
		
		ImprimirPantalla impPantalla2 = new ImprimirPantalla();
		ImprimirFichero impFichero2 = new ImprimirFichero();
		ImprimirImpresora impImpresora2 = new ImprimirImpresora();
		
		String cadena = "Hola Interfaz!";
		
		impPantalla.imprimir(cadena);
		impFichero.imprimir(cadena);
		impImpresora.imprimir(cadena);
		// Invocamos los metodos concretos
		// Esta manera NO estaria bien hecha ya que es mejor
		//  utilizar el codigo orientado a interfaces
		//metodoImprimirPantalla(impPantalla2);
		//metodoImprimirFichero(impFichero2);
		//metodoImprimirImpresora(impImpresora2);
		
		// Invocamos metodo con interfax
		metodoImprimir(impImpresora);
		metodoImprimir(impFichero);
		metodoImprimir(impPantalla);

	}
	public static void metodoImprimirPantalla(ImprimirPantalla ip) {
		ip.imprimir("Manolo");
	}
	public static void metodoImprimirFichero(ImprimirFichero ip) {
		ip.imprimir("Manolo cabezabolo");
	}
	public static void metodoImprimirImpresora(ImprimirImpresora ip) {
		ip.imprimir("Manolo");
	}
	
	// Con polimorfismo
	public static void metodoImprimir (Imprimible i) {
		i.imprimir("El chivi");
	}

}
