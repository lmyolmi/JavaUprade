package _01_basico;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Las excepciones en Java son situaciones que pueden provocar un fallo
 * en el programa.
 * 
 * Cuando se lanza una excepción en Java y no se controla, se para
 * automaticamente el programa
 */

public class IntroduccionExcepciones {

	public static void main(String[] args) {
		String s = null;
		//s.charAt(0); // Excepción, concretamente NullPointerException
		
		// La opción que tenemos en Java para controlar excepciones es mediante los
		// llamados bloques "try-catch"
		
		// En la parte "try" ponemos el codigo el cual queremos capturar posibles
		// excepciones
		// En la parte "catch" ponemos el codigo que queremos ejecutar en caso de
		// que ocurra alguna excepción, y por lo tanto NO se parará el programa.
		// Es obligatorio poner en la parte "catch" el tipo de excepción que queremos
		// capturar.
		
		// El programa continuara con su ejecución de manera normal cuando salga
		// de el bloque "try-catch"
		
		try {
			s.charAt(0);
		}catch (NullPointerException npe) {
			// Aqui ejecutamos las sentencias que queramos.
			System.out.println("OJO!! que te cojo! 's' está apuntando a NULL");
		}
		System.out.println("Continuamos con la ejecucion del programa.");
		// OJO!! Esto NO arregla el problema, esto lo unico que hace es evitar
		// que el programa se pare.
		
		// Este codigo de aqui si el usuario introduce: "trece", el programa
		// se parará, porque ocurre la excepción "InputMismatchExcepction"
		// Y como se para el programa, no puedo deciirle al usuario que lo ha
		// hecho mal
		
		/*System.out.println("Introduzca un numero");
		Scanner sc = new Scanner(System.in);
		Integer n1 = sc.nextInt(); // -> Integer es un Wrapper <- Recordatorio
		System.out.println("El numero introducido es: " + n1);
		*/
		
		// Usamos un bloque "try-catch" para evitar que el programa se pare
		try {
			System.out.println("Introduzca un numero");
			Scanner sc = new Scanner(System.in);
			Integer n1 = sc.nextInt(); // -> Integer es un Wrapper <- Recordatorio
			System.out.println("El numero introducido es: " + n1);
		}catch (InputMismatchException ime) {
			System.out.println("Eres un muñon, el valor debe de ser numerico!!");
		}
		// OJO! esto no arregla el programa!, pero al menos me da la opción de intentar
		// arreglarlo
		boolean numeroCorrecto = false;
		do {
			try {
				System.out.println("Introduzca un numero");
				Scanner sc = new Scanner(System.in);
				Integer n1 = sc.nextInt(); // -> Integer es un Wrapper <- Recordatorio
				System.out.println("El numero introducido es: " + n1);
				// Si llegamos a esta linea, no hubo una excepción
				numeroCorrecto = true;
			}catch (InputMismatchException ime) {
				System.out.println("Eres un muñon, el valor debe de ser numerico!!");
			}
			
		}while(!numeroCorrecto);
	
		// En esta ultima parte hemos usado los bloques "try-catch" para ayudarnos
		// a controlar las excepciones y poder aplicar logica para solucionarlo.
		// Muchas veces podremos controlar las excepciones con "IF", lo que suele
		// ser a nivel de codigo más optimo.
		
		String s2 = null;
		if(s2 != null) {
			s2.charAt(0);
		}
	}
}
