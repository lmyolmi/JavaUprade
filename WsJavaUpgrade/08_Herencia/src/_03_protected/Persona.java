package _03_protected;

/**
 * Recordamos el alcance de protected que es:
 * 1. Dentro de la propia clase
 * 2. Dentro de la clase del propio paquete
 * 3. Dentro de las clases que heredan de ella
 */
public class Persona {
	private String nombre;
	protected int edad;
	
	
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
	
	

}
