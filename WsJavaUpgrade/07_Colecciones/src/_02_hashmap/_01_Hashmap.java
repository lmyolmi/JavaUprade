package _02_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class _01_Hashmap {

	public static void main(String[] args) {
		// Tenemos otro tipo de estructuras muy importantes que son
		// las llamadas estructuras hash, diccionarios o arrays asociativos,
		// según el lenguaje que estemos usando
		
		// Este tipo de estructuras se caracterizan por tener una clave
		// y un valor asocidados, es decir, a partir de una clave podemos
		// acceder o modificar un valor
		
		// Solamente puede haber UNA clave, en caso de que se pongan dos
		// claves iguales, el valor se sobreescribe
		
		// Para crear una estructura de tipo hash, podemos usar la clave
		// HashMap
		HashMap<String, Double> hashmapCiudadTemperatura = new HashMap<>();
		// Podemos establecer claves y valores con el metodo put.
		hashmapCiudadTemperatura.put("Madrid", 10.0);
		hashmapCiudadTemperatura.put("Barcelona", 11.0);
		
		// Podemos acceder a los valores con el metodo get()
		Double temperatura = hashmapCiudadTemperatura.get("Madrid");
		System.out.println(temperatura + "ºC");
		temperatura = hashmapCiudadTemperatura.get("Barcelona");
		System.out.println(temperatura + "ºC");
		// Si accedemos a una clase que no existe te devuelve NULL	
		temperatura = hashmapCiudadTemperatura.get("Zaragoza");
		System.out.println(temperatura);
		
		// Las clave son CASE SENSITIVE
		// No es lo mismo "Madrid" que "MADRID"
		temperatura = hashmapCiudadTemperatura.get("MADRID");
		System.out.println(temperatura);
		
		// El objetivo de los HashMap es diferente a el de los arrays
		// sirven para hacer busquedas rápidas, no suelen servir
		// para recorrerlos.
		
		hashmapCiudadTemperatura.forEach((k, v) -> {
			System.out.print("clave: " + k.toString());
			System.out.println(" valor: " + v.toString());
		});
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Gallego");
		listaNombres.add("Marquitos");
		listaNombres.add("Guillermo");
		
		// Con funciones 
		listaNombres.forEach(v -> System.out.println("Nombre: " + v));
		
		// Si ponemos la misma clave, se sobreescribe el valor
		hashmapCiudadTemperatura.put("Madrid", 7.0);
		System.out.println(hashmapCiudadTemperatura.get("Madrid"));
		
		// Java soporta la inferencia de tipos
		// Esta caracteristica permite definir el tipo de la variable
		// en el momento de asignar el primer valor, pero OJO!
		// el tipo de la variable SIEMPRE sera del tipo del valor,
		// NO se puede cambiar. No confundir con los lenguajes NO TIPADOS.
		
		var numero1 = 34.0; // El tipo de esta variable será Double y siempre los era
		System.out.println(numero1);
		//numero1 = true; No podemos apuntar con un Double a un boolean
		numero1 = 24.0;
		var numero2 = 100;
		
		// Los tipos inferidos solo para las variables, no se pueden
		// usar en los atributos de clase.

	}

}
