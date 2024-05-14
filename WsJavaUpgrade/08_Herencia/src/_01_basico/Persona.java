package _01_basico;

/**
 * La herencia es una de las propiedades más importantes que podemos encontrar
 * en POO. Mediante la herencia podemos hacer que una clase tenga todos 
 * atributos y metodos de otra. La clase de la cual heredamos se llama
 * clase "Padre" y la clase que hereda se llama "Hija". Es decir,
 * la clase "Hija" tendra todos los atributos y metodos de la clase
 * "Padre".
 * 
 * Existe el concepto de "Herencia multiple", esto se da cuando una clase
 * hija tiene mas de un padre, por ejemplo, dos padres. En Java la herencia
 * multiple NO se implementa directamente (se puede hacer con Interface, que
 * veremos más adelante.).
 */
public class Persona {
	public String nombre;
	public int edad;
	
	
	public void presentarse() {
		System.out.println("Hola soy una persona y me llamo: " + this.nombre);
	}

}
