package _05_casting;

import java.util.ArrayList;
import java.util.List;

public class MainCasting {
	public static void main(String[] args) {
		
		Docente d1 = new Docente();
		d1.salario = 200;  // Aqui no hace falta el set ya que es protective
		d1.setNombre("Dr. Bacterio");
		d1.setEdad(56);
		
		Alumno a1 = new Alumno();
		a1.setNombre("Felipe");
		a1.setEdad(21);
		a1.curso = "Entornos de Desarrollo";
		
		Persona p1 = d1;
		System.out.println(p1.getEdad()); // El atributo edad si lo tiene entonces si puede
		// System.out.println(p1.salario); // Una clase Padre no puede acceder al atributo del hijo
		System.out.println(d1.salario);
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(a1);
		listaPersonas.add(d1);
		// LANDA
		listaPersonas.forEach(v -> v.presentarse());
		// FOR EACH NORMAL
		for(Persona p : listaPersonas) {
			p.presentarse();
		}
		metodoRecibirLista(listaPersonas);
		
	}
	private static void metodoRecibirLista(ArrayList<Persona> listaPersonas) {
		// queremos mostrar todos los datos de los objetos
		// Alumno a1 = listaPersonas.get(0); No puedes apuntar con alumno al array porque es Persona y esta por encima
		Persona p1 = listaPersonas.get(0);
		//System.out.println(p1.curso); // Esta referencia NO tiene "curso"
		
		// Si queremos acceder a todos los métodos y atributos de un objeto
		// debemos de usar el mando a distancia del objeto. Para ellos aplicamos
		// el "Casting" que vimos ya en el Tema 1
		
		// Con el "Casting" cambiamos una referencia de tipo. Para poder
		// acceder a los metodos/atributos.
		Alumno a1 = (Alumno)p1;
		System.out.println(a1.curso);
		
		// Problema, Java no sabe en tiempo de ejecución a que objetos estas
		// apuntando, por lo que queda a nuestra responsabilidad hacer el
		// "Casting" bien.
		
		// En este caso, Java te deja en tiempo de compilación hacer un "Casting"
		// a una referencia de tipo Docente, lo que ocurre es que al ser un objeto
		// de tipo Alumno, no podemos usar una referencia de tipo "Docente" para
		// apuntar, en este caso dará una excepción de tipo "ClassCastException"
		//Docente d1 = (Docente)p1;
		
		// Para saber la clase de un objeto podemos y evitar "ClassCastException"
		// podemos usar la palabra reservdada "instance of"
		if(p1 instanceof Alumno) {
			//System.out.println(p1.curso); // Esto no se hace, ya que hace falta Castear primero para poder usar
			// el metodo y atributos de la clase Alumno.
			Alumno a2 = (Alumno)p1;
			System.out.println(a2.curso); // ESTO NUNCA ME VA A DAR ERROR
			// Ya que le dice por if en caso de que p1(Persona) sea una instancia de Alumno
		}
		// Dicho de otra manera, podemos recorrer el array preguntando
		// de que tipo es cada objeto
		for(Persona p: listaPersonas) {
			// Mediante el polimorfismo en este caso no hace falta castear
			// ya que el metodo es de la clase Persona, y por lo tanto
			// se ejecutara el presentarse() del objeto que esta siendo
			// apuntado.
			// El cast se utiliza cuando necesitamos usar atributos/metodos
			// que no tenemos en la referencia padre
			p.presentarse();
			if(p instanceof Alumno) {
				Alumno a = (Alumno)p;
				System.out.println(a.curso);
			}
			if(p instanceof Docente) {
				Docente d = (Docente)p;
				System.out.println(d.salario);
			}
		}
	}
	

}
