package _03_metodos;

import java.util.Scanner;

public class _01_MetodosYExcepciones {

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
			e.printStackTrace(); // Imprime el log del error |Utiliza "system.err"
		}
		System.out.println("El numero es: " + numero);
		
		// Invocamos a la otra funcion
		
		// Las Excepciones de TIPO "RuntimeException" son excepciones
		// que se llaman "unchecked" esto quiere decir que NO tenemos
		// porque capturar las excepciones con un bloque "try-catch"
		// aunque muchas veces tengamos que hacerlo
		System.out.println("Introduzca otro numero");
		int numero2 = recogerNumeroRunTimeException();
		// Hay que tener claro que en Java si ocurre una excepción
		// y no la controlamos (es decir, no usamos el bloque "try-catch")
		// el programa se parará. Por ejemplo, en la linea 27 como no hemos
		// capturado el error, si occure, se nos parará el programa.
		
		// Las excepciones "unchecked" tambien podemos controlarlas con bloques
		// "try-catch" usando la opcion de Eclipse -> surrounded with -> try-catch block <- Para hacerlo automatico
		try {
			int numero3 = recogerNumeroRunTimeException();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Nos podriamos preguntar cuando arrojar excepciones "checked"
		// o "unchecked". Con "checked" es cuando queremos dar mucha
		// importancia a la excepcion y queremos obligar al programador
		// a poner un bloque "try-catch". Con "unchecked" no queremos
		// darle tanta importancia a la excepcion y NO hace falta poner
		// un bloque "try-catch". Digamos que las "checked" pueden 
		// tener mas "probabilidad" de ocurrir.

	}
	
	// Hay veces que nos interesa avisar a quien llame a este método
	// de que ha habido una excepcion. Para ello podemos usar
	// la palabra reservada "throws" al final del método y
	// a continuación el TIPO de excepción que queremos devolver
	// En este caso usaremos la clase "Exception" para arrojar
	// cualquier excepción. De hecho, se DEBE de documentar
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
		int numero = sc.nextInt();
		return numero;
		
	}

}
