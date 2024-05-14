package _03_metodos;

import java.util.Scanner;

public class _02_MetodosYExcepciones {

	public static void main(String[] args) {
		// Cuando usamos un método que arroja excepciones de tipo
		// Exception, se llaman excepciones "checked" y tenemos
		// que poner un bloque "try-catch" OBLIGATORIAMENTE
		
		System.out.println("Introduzca un numero");
		int numero = 0;
		try {
			numero = recogerNumero();
		} catch (Exception e) {
			// Este bloque ha sido generado automaticamente con Eclipse
			// y te invoca automaticamente al meotod "e.printStackTrace"
			System.out.println("Ha ocurrido un error llamando al metodo");
	}
		System.out.println("El numero es: " + numero);
	}
	
	/**
	 * Recoger un numero pasado por consola
	 * @return el numero recogido
	 * @throws Exception si el valor introducido no es un numero entero.
	 */
	public static int recogerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}
	
	public static int recogerNumeroRunTimeException() throws RuntimeException{
		Scanner sc = new Scanner(System.in);
		int numero;
		try {
			numero = sc.nextInt();
			return numero;
		} catch (Exception e) {
			System.out.println("Valor incorrecto");
			// Para arrojar un error podemos usar la palabra "throw"
			throw e;
		}finally {
			// Este bloque se ejecuta SIEMPRE sin importar si ha entrado
			// o  no por el catch
			System.out.println("Esto siempre se ejecuta haya o no error.");
		}
		
	}

}
