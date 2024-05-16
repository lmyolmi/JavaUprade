package mainimportacion;

import operaciones.Matematicas;

public class Main {

	public static void main(String[] args) throws Exception{
		int n1 = 4;
		int n2 = 5;
		
		int resultado = Matematicas.sumar(n1, n2);
		System.out.println("El resultado de la operacion es " + resultado);
		
		resultado = Matematicas.dividir(n1, n2); // Arrojamos la excepción.

	}

}
