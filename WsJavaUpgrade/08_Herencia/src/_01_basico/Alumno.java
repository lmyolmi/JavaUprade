package _01_basico;
/**
 * En Java, para heredar una clase de otra se usa la palabra reservada
 * "extends" despues del nombre de la clase, y a continuacion el nombre 
 * de la clase "Padre".
 */
public class Alumno extends Persona {
	// Automaticamente la clase alumno tiene todos los atributos de la clase
	// Persona (nombre, edad) asi como sus metodos (presentarse()).
	
	// OJO! No se heredan los constructores
	
	public String curso;
	
	public boolean esCiencias() {
		if(this.curso.equals("DAM")) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * Existe un concepto muy importante en la herencia conocido como
	 * la "sobreescritura" o "Override" de metodos.
	 * Para sobreescribir un metodo, debemos crear un metodo en la clase
	 * "Hija" con la misma FIRMA que el metodo "Padre"
	 * 
	 * Cuando sobreescribimosun método queremos darle un comportamiento 
	 * diferente al de la clase "Padre"
	 * 
	 * La notacion @Override simplemente sirve para comprobar que el metodo
	 * existe en la clase "Padre" y lo estamos sobreescribiendo. En caso de que
	 * el método no exista en la clase padre daría un error en tiempo de
	 * compilación.
	 */
	
	
	@Override
	public void presentarse() {
		System.out.println("Hola soy el alumno muñon de nombre : " + this.nombre);
	}

	
}
