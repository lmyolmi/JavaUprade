package _01_basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_CapturarVariasExcepciones {

	public static void main(String[] args) {
		// Vamos a hacer un programa que pida dos numeros por pantalla
		// y devuelva su division entera
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numerador");
		int numerador = sc.nextInt();
		System.out.println("Introduzca el denominador");
		int denominador = sc.nextInt();
		int resultado = numerador/denominador;
		System.out.println(resultado);
		*/
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
			}
		}while(!numeroCorrecto);
	}

}
