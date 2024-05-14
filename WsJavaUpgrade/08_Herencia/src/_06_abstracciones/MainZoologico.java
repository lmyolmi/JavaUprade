package _06_abstracciones;

import java.util.ArrayList;
import java.util.List;

public class MainZoologico {

	public static void main(String[] args) {
		
		// Animal animal = new Animal;
		// Pez pez = new Pez();
		Animal t = new Trucha();
		t.setNombre("RObustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		// Normalmente cuando creamos un objeto usaremos
		// una referencia de su propio tipo, ya que si no
		// debemos de hacer un casting.
		//t.setNumeroAletas();
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2);
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0);
		c.setPeso(0.2);
		c.setSexo(Sexo.HEMAFRODITA);
		
		Leon a = new Leon();
		a.setNombre("Simba");
		a.setEdad(5);
		a.setPeso(180);
		a.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setEdad(6);
		tiburon.setPeso(3);
		tiburon.setSexo(Sexo.NO_BINARIO);
		
		// Siempre es mejor utilizar referencias de interfaces 
		// para apuntar a objetos.
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(trucha);
		listaAnimales.add(c);
		listaAnimales.add(a);
		listaAnimales.add(tiburon);
		
		// Vamos a dar de comer a los animales mediante el polimorfismo
		Animal alimento1 = new Leon();
		alimento1.setPeso(1);
		alimento1.setNombre("comida");
		
		for(Animal animal : listaAnimales) {
			// Aplicamos polimorfismo, cada objeto llamara a su metodo comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso: " + animal.getPeso());
		}
		Alga alga = new Alga();
		alga.setPeso(0.8);
		listaAnimales.forEach(v ->{
			 v.comer(alga);
			 System.out.println("Mi nuevo peso: " + v.getPeso());
		});
		// Decimos al leon que se coma asi mismo
		a.comer(a);
		System.out.println("Mi nuevo peso: " + a.getPeso());
		tiburon.comer(tiburon);
		System.out.println("Mi nuevo peso: " + tiburon.getPeso());
		
		// Clases anonimas
		//--------------------
		// Son aquellas clases que se instancian a partir de una clase abstracta o una interfaz
		// Se crean al mismo tiempo una clase que extiende de la clase abstracta y el objeto
		
		//  Este tipo de clases se utilizan cuando solo se va a crear 
		// un objeto de este tipo de clase
		
		Animal pinguino = new Animal() {
			
			// Estamos creando una clase y un objeto al mismo tiempo
			// y la clase NO tiene nombre (es anonima)
			@Override
			public void comer(Object o) {
				if(o instanceof Trucha) {
					System.out.println("Me como la Trucha");
				}else {
					System.out.println("Solo como truchas");
				}
			}
			// Es una clase de usar y tirar
		};
		listaAnimales.add(pinguino);
		for(Animal animal : listaAnimales) {
			// Aplicamos polimorfismo, cada objeto llamara a su metodo comer
			animal.comer(alimento1);
			System.out.println("Mi nuevo peso: " + animal.getPeso());
		}
		
	
		

	}

}
