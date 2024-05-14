package _02_basico;

import java.util.ArrayList;

public class MainVehiculo {
	public static void main(String[] args) {
		
		Avion avion = new Avion();
		avion.setFechaFabricacion("23/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto moto = new Moto();
		moto.setFechaFabricacion("23/12/2009");
		System.out.println(moto.esAntiguo());
		
		Barco barco = new Barco();
		barco.setEsPirata(true);
		barco.setFechaFabricacion("23/12/2003");
		barco.setMarca("La sirena feliz");
		barco.setPeso(3500);
		barco.setVelocidad(20);
		
		// La capacidad de que una referencia ejecute un metodo u otro 
		// dependiendo al objeto al que estamos apuntando se llama
		// polimorfismo.
		System.out.println(avion);
		System.out.println(moto);
		System.out.println(barco);
		
		// Con una referencia de una clase superior (o padre) podemos
		// apuntar a cualquier objeto inferior (o hijo)
		// OJO!, no podemos hacerlos al reves, es decir, con una referencia
		// inferior (o hija) no podemos apuntar a un objeto superior (o padre).
		
		Vehiculo v1 = new Coche();
		// VehiculoTerrestre vt = new Moto(); ESTO SI FUNCIONARIA
		// Moto m1 = new Coche() / NO SE PODRIA (SERIAN ALGO COMO HERMANOS)
		// Moto m1 = new Vehiculo();No se podria
		//Vehiculo v2 = new VehiculoTerrestre(); / SI SE PODRIA
		
		// IMPORTANTE: Aunque con una referencia superior podemos apuntar a objetos 
		// inferiores. Solo podemos usar los metodos o atributos que tengan la referecia.
		// Vehiculo v2 = new vehiculoTerrestre();
		// v2.getTipoMoto();// NO (Este es el padre por lo tantos los atributos no los tiene)
		// v2.getMatricula() // NO ^^^
		Vehiculo v3 = new Moto();
		v3.getVelocidad(); // EN este caso si se podria ya que el atributo velocidad es un atributo
		// de v3.
		// v3.getTipoMoto() /
		
		// Nos podriamos preguntar, para que vamos a usar
		// una referencia padre en vez de la hija.La respuesta
		// es, aunque no podamos usar todas los métodos
		// del objeto hijo, ganamos en versatilidad ,es decir
		// podemos apuntar (con todo lo que conlleva)y utilizar
		// todos los metodos de la referencia.
		
		// Imagina ,que se os pide guardar todos los objetos
		// que cree un usuario en memoria.
		
		ArrayList<Moto> listaMotos = new ArrayList<Moto>();
		listaMotos.add(moto);
		//listaMotos.add(avion); Esto necesitara un array de aviones
		ArrayList<Avion> listaAvion = new ArrayList<Avion>();
		listaAvion.add(avion);
		
		System.out.println("*****************************************");
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		listaVehiculos.add(barco);
		listaVehiculos.add(moto);
		listaVehiculos.add(avion);
		for(Vehiculo s : listaVehiculos) {
			// Mediante el polimorfismo, el método que se
			// ejecutara sera el del objeto al que estemos
			// apuntando no el metodo de la referencia
			
			// En esye ejemplo, dependiendo del objeto
			// al que estemos apuntando, se ejecutará su
			// metodo toString o esAntiguo del propio objeto
			System.out.println(s.toString());
			System.out.println(s.esAntiguo());
			//System.out.println(s.esPirata()); / No deja
			System.out.println("****************");
		}
	}
	
}
