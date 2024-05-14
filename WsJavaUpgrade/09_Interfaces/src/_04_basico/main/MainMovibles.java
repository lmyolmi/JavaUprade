package _04_basico.main;

import java.util.ArrayList;
import java.util.List;

import _04_basico.animales.Animal;
import _04_basico.animales.Cangrejo;
import _04_basico.animales.Leon;
import _04_basico.animales.Sexo;
import _04_basico.animales.Tiburon;
import _04_basico.animales.Trucha;
import _04_basico.interfaz.Movible;
import _04_basico.vehiculos.Camion;
import _04_basico.vehiculos.Coche;
import _04_basico.vehiculos.Moto;
import _04_basico.vehiculos.VehiculoTerrestre;

public class MainMovibles {

	public static void main(String[] args) {
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
		
		VehiculoTerrestre vh1 = new Camion();
		vh1.setPeso(2500);
		VehiculoTerrestre vh2 = new Coche();
		vh2.setPeso(1000);
		VehiculoTerrestre vh3 = new Moto();
		vh3.setPeso(400);
		
		List<Movible> listaMovibles = new ArrayList<Movible>();
		listaMovibles.add(trucha);
		listaMovibles.add(tiburon);
		listaMovibles.add(a);
		listaMovibles.add(tiburon);
		listaMovibles.add(c);
		listaMovibles.add(vh3);
		listaMovibles.add(vh2);
		listaMovibles.add(vh1);
		
		System.out.println("Moviendo lento a los elementos movibles");
		listaMovibles.forEach(v -> v.moverseLento());
		System.out.println("Moviendo rapido a los elementos movibles");
		listaMovibles.forEach(v -> v.moverseRapido());
		// Equivalente a:
		for(Movible m : listaMovibles) {
			m.moverseRapido();
		}
		
		// las interfaces NO se pueden instanciar
		//Movible m1 = new Movible();
		
		// Pero SI podemos crear clases anónimas
		Movible m1 = new Movible() {
			
			// Podemos crear atributos, pero es muy dificil
			// acceder a ellos
			public int atributo1;
			// suponemos que el objeto movible es un barco 
			@Override
			public void moverseRapido() {
				System.out.println("Soy un barco y me muevo a 345");
				
			}
			
			@Override
			public void moverseLento() {
				System.out.println("Soy un barco y me muevo a 230");
				
			}
		};
		
		listaMovibles.add(m1);
		
		

	}

}
