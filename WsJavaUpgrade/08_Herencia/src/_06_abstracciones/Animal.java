package _06_abstracciones;

import java.util.Objects;

/*
 * Las clases abstractas son clases que NO se pueden instanciar.
 * Las utilizaremos para que otras clases hereden de ellas y 
 * tambien podemos usar sus referencias para poder guardar
 * cualquier objeto que extienda de esta clase y además para
 * aplicar polimorfismo
 * 
 * Una clase abstracta puede tener o no tener métodos abstractos 
 * pero en cuanto la clase un solo método abstracto la clase
 * DEBE ser abstracta
 */

public  abstract class Animal {
	//Una clase abstracta puede tener perfectamente métodos NO abstractos
	private Sexo sexo;
	private double peso;
	private int edad;
	private String nombre;
	
	public Sexo getSexo() {
		return sexo;
	}



	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, peso, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && sexo == other.sexo;
	}



	/**
	 * Los metodos abstractos son métodos que sabemos <b> QUE </b> todos los objetos
	 * que hereden de esta clase lo tendran, pero el <b>COMO</b> lo van a hacer corresponde
	 * a la implementación del metodo de la clase hija.
	 * 
	 * En este ejemplo, sabemos QUE todos los animales pueden comer pero lamentablemente
	 * todavia no sabemos COMO, por lo que correspondera en las clases hijas implementar
	 * dicho método.
	 * 
	 * Documentacion:
	 * 
	 * 
	 * Este metodo hace que el animal gane peso según la comida que reciba por parametro
	 * @param o representa el objeto que se va a comer el animal
	 */
	public abstract void comer(Object o);

}
