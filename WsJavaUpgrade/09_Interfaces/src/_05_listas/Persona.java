package _05_listas;

import java.util.List;

import _04_basico.vehiculos.Coche;

public class Persona {
	private String nombre;
	// Si ponemos el tipo de atributo como la interface. Dejamos
	// abierto a que los programadores puedan poner el tipo de 
	// lista que quieran (ArrayList / LinkedList) y NO
	// permitimos solo un tipo.
	// Es MUY buena practica de programacion usar interfaces
	// en lugar de implementaciones concretas
	private List<Coche> listaCoches;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Coche> getListaCoches() {
		return listaCoches;
	}
	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}
	
	

}
