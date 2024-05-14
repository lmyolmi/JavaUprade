package _05_listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import _04_basico.vehiculos.Coche;

public class MainListas {

	public static void main(String[] args) {
		// Java tiene ya Muchas interfaces predefinidas
		// Una de las mas importantes es la interfaz "List"
		
		// En este interfax se define los metodos que tienen
		// que implementar TODAS las clases que implementen
		// la interfax "List", kas mas importantes son:
		
		// La clase Arraylist y la clase LinkedList
		// La implementacion de ArrayList es una implementacion
		// que es muy buena cuando queremos recorrer la lista
		// muchas veces pero no suele cambiar de tamaño
		
		// La implementacion LinkedList es muy buena cuando
		// la lista cambia mucho de tamaño pero en cambio 
		// no la recorremos demasiado
		
		List<Coche> listaCoche = new ArrayList<Coche>();
		listaCoche.add(new Coche());
		
		List<Coche> listaLinkedCoches = new LinkedList<Coche>();
		// como ambas listas implementan la interfaz "List" tenemos los mismos
		// metodos, por lo tanto, para nosotros los programadores NO
		// habrá diferencia de como vamos a usar ambas listas
		listaLinkedCoches.add(new Coche());
		recorrerLista(listaLinkedCoches);
		recorrerLista(listaCoche);
		
		// Creamos las personas con sus coches
		Persona p = new Persona();
		p.setNombre("Gullermo");
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		List<Coche> listaCoches1 = new ArrayList<Coche>();
		listaCoches1.add(c2);
		listaCoches1.add(c1);
		p.setListaCoches(listaCoches1);
		
		Almacen<Coche> aCoche = new Almacen<Coche>();
		aCoche.setDato(c2);
		
	

	}
	
	public static void recorrerLista(List<Coche> lista) {
		System.out.println(lista);
	}

}
