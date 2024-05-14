package _05_listas;


// Esto se llama Generics en Java || Parecido a ArrayList
// public class Almacen<E extends VehiculoTerrestre>// Al hacer esto E. podemos acceder
// a los metodos de la clase VehiculoTerrestre
public class Almacen<E> {
	private E dato;

	public E getDato() {
		return dato;
	}

	public void setDato(E dato) {
		this.dato = dato;
	}
	
	

}
