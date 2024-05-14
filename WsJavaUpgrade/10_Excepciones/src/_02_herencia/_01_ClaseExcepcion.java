package _02_herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_ClaseExcepcion {

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
			}catch(Exception e) {
				// Si usamos la clase exception, al ser la clase padre
				// cualquier excepcion que ocurra la controlaremos
				System.out.println("Ha ocurrido algun error");
			}
		}while(!numeroCorrecto);
		
	}

}
