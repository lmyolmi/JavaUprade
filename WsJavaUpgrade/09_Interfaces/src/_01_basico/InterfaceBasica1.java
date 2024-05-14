package _01_basico;

/**
 * Las Interfaces es un tipo especial de clase en la que TODOS
 * sus métodos son abstractos.
 * 
 * Estan pensadas para que sean implementadas por otras clases
 * 
 * Las interfaces definen el QUE queremos hacer, mientras que
 * las clases que implementan las interfaces representan el
 * COMO
 * 
 * Las interfaces son un contrato que tienen que cumplirse en
 * las clases que implementan dicha interface
 * 
 * Cuando una clase implementa una interface tiene la obligación
 * de implementar los metodos de dicha interface.Una excepción
 * sería si la clase que implementa la interface es ABSTRACTA.
 * 
 * Las interfaces NO son instanciables, debido a que todos sus 
 * metodos son abstractos. Pero OJO!! podemos crear clases
 * ANONIMAS a partir de las interfaces
 * 
 * Una propiedad muy importante de las interfaces es que mediante
 * una referencia de una interface podemos apuntar a cualquier
 * objeto que implemente dicha interface.
 * 
 * Una interface puede tener atributos PERO siempre seran CONSTANTES
 * 
 * Cuando se crea una interface suele ser importante crear buena 
 * documentacion de la misma.
 * 
 * Todos los metodos y atributos de una interface son PUBLIC, no importa que
 * lo pongáis explicitamente en el metodo.
 * 
 * Para crear una interfaz en Java se hace como una clase pero se usa
 * la palabra "interface". Aunque normalmente se creara mediante Eclipse.
 */
public interface InterfaceBasica1 {
	// Esto sería un atributo constante
	// No suelen tener atributos las interfaces.
	int ATRIBUTO_1 = 5;
	//public final int ATRIBUTO_2 = 5; // Esto seria equivalente a lo de arriba
	
	// Lo realmente importante de las interfaces son los metodos.
	// Siempre seran publicos y abstractos
	void metodo1();
	// public abstract void metodo2(); // Esto seria equivalente a lo de arriba
	public abstract String metodo2(Object o);
	
	int operacion(int a, int b);

}
