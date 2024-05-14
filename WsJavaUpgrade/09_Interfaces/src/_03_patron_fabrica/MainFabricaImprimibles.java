package _03_patron_fabrica;

import java.util.Scanner;

import _01_basico.Imprimible;

public class MainFabricaImprimibles {

	public static void main(String[] args) {
		
		FabricaImprimibles f1 = new FabricaImprimibles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un objeto que quiera crear");
		System.out.println("1- Pantalla");
		System.out.println("2- Fichero");
		System.out.println("3- Impresora");
		String opcion = sc.nextLine();
		opcion.toLowerCase();
		Imprimible ip = f1.crearImprimible(opcion);
		
		System.out.println("Introduzca la frase a imprimir");
		String frase = sc.nextLine();
		ip.imprimir(frase);	
		

	}

}
