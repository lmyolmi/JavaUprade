package programa;

public class MainPruebasBrujo {

	public static void main(String[] args) {
		// Vamos a probar la clase brujo, definiendo su 
		// bateria de pruebas y ejecutando sus métodos.
		
		
		// Método setPoder()
		// Seran 2 pruebas las que hagamos para este método
		
		// Prueba 1
		// poder = 100
		// resultadoEsperado = 100
		
		// Prueba 2
		// poder = -100
		// resultadoEsperado = 0
		
		// Prueba 3
		// poder = 20
		// poder = -20
		// resultadoEsperado = 0        

		
		// Ejecutamos la prueba 1
		System.out.println("---------------------------");
		Brujo brujo1 = new Brujo();
		int poder1 = 100;
		int resultadoEsperado = 100;
		brujo1.setPoder(poder1);
		int resultadoObtenido = brujo1.getPoder();
		if (resultadoObtenido == resultadoEsperado) {
			System.out.println("Prueba1 realizada con exito.");
		}else {
			System.out.println("Prueba1 Erronea");
		}
		// Ejecutamos la prueba 2
		System.out.println("---------------------------");
		Brujo brujo2 = new Brujo();
		int poder2 = -100;
		int resultadoEsperado2 = 0;
		brujo2.setPoder(poder2);
		int resultadoObtenido2 = brujo2.getPoder();
		if (resultadoObtenido2 == resultadoEsperado2) {
			System.out.println("Prueba2 realizada con exito.");
		}else {
			System.out.println("Prueba2 Erronea");
		}
		
		// Ejecutamos la prieba 3
		System.out.println("---------------------------");
		Brujo brujo3 = new Brujo();
		brujo3.setPoder(20);
		brujo3.setPoder(-20);
		int resultadoEsperado3 = 0;
		int resultadoObtenido3 = brujo3.getPoder();
		if (resultadoObtenido3 == resultadoEsperado3) {
				System.out.println("Prueba3 realizada con exito.");
		}else {
				System.out.println("Prueba3 Erronea");
		}
		
		// Método estaMuerto()
		// Seran 3 pruebas
		
		// Prueba 1
		// vida = 0
		// tieneAlma = false
		// valorEsperado = true
		
		// Prueba 2
		// vida = 1
		// tieneAlma = false
		// valorEsperado = true
		
		// Prueba3
		// vida = 1
		// tieneAlma = true
		// valorEsperado = false
		
		// Prueba 1 Ejecucion
		System.out.println("--------------------");
		Brujo brujo4 = new Brujo();
		int vida1 = 0;
		brujo4.setVida(vida1);
		boolean resultadoEsperado4 = true;
		boolean resultadoObtenido4 = brujo4.estaMuerto();
		if(resultadoEsperado4 == resultadoObtenido4) {
			System.out.println("Prueba2-1 realizada con exito.");
		}else {
				System.out.println("Prueba2-1 Erronea");
		}
		// Prueba 2
		System.out.println("--------------------");
		Brujo brujo5 = new Brujo();
		int vida2 = 1;
		brujo5.setVida(vida2);
		brujo5.setTieneAlma(false);
		boolean resultadoEsperado5 = true;
		boolean resultadoObtenido5 = brujo5.estaMuerto();
		if(resultadoEsperado5 == resultadoObtenido5) {
			System.out.println("Prueba2-2 realizada con exito.");
		}else {
				System.out.println("Prueba2-2 Erronea");
		}
		// Prueba 3
		System.out.println("--------------------");
		Brujo brujo6 = new Brujo();
		int vida3 = 1;
		brujo6.setVida(vida3);
		brujo6.setTieneAlma(true);
		boolean resultadoEsperado6 = false;
		boolean resultadoObtenido6 = brujo6	.estaMuerto();
		if(resultadoEsperado6 == resultadoObtenido6) {
			System.out.println("Prueba2-3 realizada con exito.");
		}else {
				System.out.println("Prueba2-3 Erronea");
		}
		
	}
}


