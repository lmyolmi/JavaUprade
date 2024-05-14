package _01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {

	public static void main(String[] args) {
		// Los arrays "normales" en Java tienen un problema y es que son
		// estaticos, es decir, una vez creado el array, el tamaño no
		// puede cambiar nunca. Si creamos un array de 5 elementos
		// solo podrá tener 5 elementos.
		
		String[] arrayString1 = new String[5];
		// Aunque no tenga ningún elemento el array si pregunto
		// por su tamaño, me dice 5
		System.out.println(arrayString1.length);
		
		// Normalmente este tipo de array NO se suele utilizar en Java.
		// En su lugar se utilizan arrays dinamicos, es decir
		// arrays que se amplia el tamaño en tiempo de ejecución
		// dicho de otra manera, nunca se llenan.
		
		// La clase Arraylist se tiene que parametrizar, esto es,
		// se pone entre < > el tipo de dato que queremos que contenga el
		// ArrayList. A los arraylist yo los llamo listas.
		ArrayList<String> listaStrings1 = new ArrayList<String>();
		// Si preguntamos por el tamaño del array
		System.out.println(listaStrings1.size());
		
		// Con arrays normales tenemos que tener siempre en 
		// cuenta la posición del array que estamos usando.
		arrayString1[0] = "Tom Sawyer";
		arrayString1[1] = "Scooby Doo";
		
		// Con arrayList no necesitamos controlar la última posición 
		// usada, podemos usar el método "add" que añade automáticamente
		// a la última posición libre del array.
		
		listaStrings1.add("Goku");
		listaStrings1.add("Vegeta");
		
		// Pare recorrer array lo ponemos igual, pero vemos diferencias
		System.out.println("Imprimiendo array");
		for(String s: arrayString1) {
			System.out.println(s);
		}
		System.out.println("Imprimiendo arrayList");
		for(String s: listaStrings1) {
			System.out.println(s);
		}
		
		// Accediendo a elementos concretos
		System.out.println(arrayString1[0]);
		System.out.println(listaStrings1.get(0));
		
		// Estas dos sentencias dan Exceptions
		//System.out.println(arrayString1[5]); // ArrayIndexOutOfBoundsException
		//System.out.println(listaStrings1.get(2)); // IndexOutOfBoundsException
		
		// El método add esta sobrecargado
		
		// Podemos rellenar posiciones concretas
		listaStrings1.set(1, "Broly");
		
		// Notese la diferencia de imprimir directamente un array y un arrayList.
		System.out.println(arrayString1); // Este imprime la localizacion del objeto y el hash code.
		System.out.println(listaStrings1); // Este imprime lo que hay dentro del array.
		System.out.println(Arrays.toString(arrayString1)); // con el metodo tostring de Arrays te muestra el contenido.
		
		// Podemos añadir un elemento a una posicion dada y desplazaría
		// los demas.
		listaStrings1.add(1, "Freezer"); // [Goku, Freezer, Broly]
		System.out.println(listaStrings1);
		
		// La parametrización de los arraylist NO admiten primitivos
		// pero afortunadamente Java inventó los tipos "Wrapper" de los
		// primitivos. Dicho de otra manera todos los primitivos
		// tienen su equivalente a objeto.
		
		int numero = 5;
		// Integer numeroObjeto = new Integer(5);
		// Normalmente esta el concepto "auto wrapper" que hace
		// que Java convierta directamente un primitivo a un objeto
		Integer numeroObjeto = 5; // Esto crea un objeto con el valor 5 internamente
		// Los objetos de tipo wrapper son "inmutables". Un objeto inmutable
		// se define como un objeto el cual no se puede cambiar NUNCA el valor
		// de sus atributos (también llamado estado).
		numeroObjeto = 6;
		
		// La clase String también es inmutable.
		String s = "Sherlock";
		s = "Dr. Wattson";
		
		String s2 = "Sherlock";
		
		// Existen tipos wrapper para todos los primivitos
		// que se suelen llamar igual que el primitivo pero
		// con la primera letra en mayúscula.
		double d1 = 4.5;
		Double d2 = 5.6;
		Boolean b1 = true;
		Float f1 = 4.5F;
		Character c1 = 'd';
		Byte byte1 = 23;
		
		// ArrayList<int> listaEnteros = new ArrayList<int>() // El int no funciona aqui porque es primitivo
		ArrayList<Integer> listaEnteros = new ArrayList<>(); // Al usar el wrapper si funciona.
		// Operador diamante, desde la 1.7 y dice que no es
		// necesario crear el objeto con la parametrización,
		// automaticamente coge el de la referencia
		ArrayList<Double> listaDobles = new ArrayList<Double>();
	}

}
