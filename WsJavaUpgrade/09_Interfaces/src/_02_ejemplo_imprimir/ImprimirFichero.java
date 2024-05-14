package _02_ejemplo_imprimir;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import _01_basico.Imprimible;

public class ImprimirFichero implements Imprimible {

	@Override
	public void imprimir(String cadena)  {
		// Este metodo arroja Excepciones que DEBEMOS controlar
		// Con esta clase vamos a poder escribir en un fichero
		// de texto cadenas
		try {
			PrintWriter pw = new PrintWriter("fichero.txt");
			// El objeto tiene un metodo que nos permite escribir 
			// en el fichero que se llama igual que el meotodo
			// de la clase "System.out"
			pw.println(cadena); // Llenamos el buffer con informacion
			pw.flush(); // Pasamos la informacion del buffer al fichero.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
