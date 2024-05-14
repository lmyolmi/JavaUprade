package _01_basico;
/**
 *  En Java, para heredar una clase de otra se usa la palabra reservada
 * "extends" despues del nombre de la clase, y a continuacion el nombre 
 * de la clase "Padre".
 */
public class Docente extends Persona {
	// Automaticamente la clase alumno tiene todos los atributos de la clase
	// Persona (nombre, edad) asi como sus metodos (presentarse())
	
	public double salario;
	
	public double calcularSalarioNeto() {
		double salarioNeto = this.salario*0.85;
		return salarioNeto;
	}

}
