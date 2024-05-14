package _04_object;

import java.util.Objects;

/**
 * Todas las clases de JAVA heredan de la clase Object, por lo tanto
 * todas las clases van a heredar sus métodos. 
 */
public class Persona extends Object { // Poner esto no importa, lo pongamos o no
	private String nombre;			  // la clase hereda de Object
	protected int edad;
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}


	public void presentarse() {
		System.out.println("Hola soy una persona y me llamo: " + this.nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * Para hacer que dos objetos sean iguales en las condiciones que queramos
	 * debemos de sobreescribir los métodos "equals" y "hashcode".
	 * 
	 * El método "equals" de la clase Object por defecto compara si las dos referencias
	 * apuntan al mismo objeto, es decir, funcionan exactamente igual que el operador "=="
	 * 
	 * Cuando sobreescribimos el método "equals" decimos que atributos
	 * tienen que ser iguales para que los dos objetos se consideren iguales
	 * 
	 * Boton derecho -> Source -> Generate hashCode() and equals() -> Y elegimos los atributos.
	 * 
	 */
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}


	/**
	 * En este caso hemos elegido que dos objetos sean iguales
	 * cuando su nombre y su edad tengan el mismo valor.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj; // Castear la referencia a tipo Persona
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	

}
