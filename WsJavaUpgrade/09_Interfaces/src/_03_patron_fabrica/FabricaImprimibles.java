package _03_patron_fabrica;

import _01_basico.Imprimible;
import _02_ejemplo_imprimir.ImprimirFichero;
import _02_ejemplo_imprimir.ImprimirImpresora;
import _02_ejemplo_imprimir.ImprimirPantalla;

/**
 * El patron fabrica es muy usado en la industria y sirve como
 * fabrica de objetos comunes, que normalmente siguen 
 * una interface o una clase abstracta
 * 
 * El objetivo de esta clase es hacer que estos objetos
 * creen otros objetos de tipo Imprimible
 * 
 * Este sería el principio de la inyección de dependencias
 */
public class FabricaImprimibles {
	
	public Imprimible crearImprimible (String nombre) {
		Imprimible i = null;
		if (nombre.equals("pantalla")) {
			 i = new ImprimirPantalla();
			return i;
		}else if (nombre.equals("fichero")) {
			 i = new ImprimirFichero();
			return i;
		}else if (nombre.equals("imprimir")) {
				 i = new ImprimirImpresora();
				return i;
		}
		else {
			return null;
		}
		
	}

}
