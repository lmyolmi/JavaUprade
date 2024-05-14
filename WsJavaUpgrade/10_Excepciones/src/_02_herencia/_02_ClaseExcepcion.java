package _02_herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_ClaseExcepcion {

	public static void main(String[] args) {
		// Aunque la clase padre de todas las clases sea la clase Object
		// Para las excepciones se considera la clase "Exception". Todas
		// las excepciones que hemos trabajado:
		// NullPointerException
		// ArrayIndexOfBoundException
		// ArithmeticException
		// ...
		// Todas estas excepciones tienen como padre la clase Exception
		// Con esto queremos decir que con una refrencia de la clase
		// exception podemos apuntar a cualquier excepcion
		
		// Vamos a utilizar el ejemplo anterior
		// pero esta vez vamos a controlar las especificas
		// y las genericas
		
		// Esta puede ser una buena practica de programacion
		// capturar las excepciones que conozcas y luego
		// tener un bloque "catch" generico para capturar
		// las que no conozcas
		boolean numeroCorrecto = false;
		do {
			numeroCorrecto = false;
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Introduzca el numerador");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println(resultado);
				numeroCorrecto = true;
				
			}catch(InputMismatchException ime) {
				System.out.println("Ha introducido una cadena en vez de un numero");
			}catch(ArithmeticException ae) {
				// Podemos tener tantos bloques "catch" como queramos, y en cada
				// bloque capturar el tipo de excepcion que necesitemos.
				System.out.println("No aceptamos divisiones por 0");
			}catch(Exception e) {
				// Si usamos la clase exception, al ser la clase padre
				// cualquier excepcion que ocurra la controlaremos
				System.out.println("Ha ocurrido algun error");
			}
		}while(!numeroCorrecto);
		
	}

}
