package junit5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit5.programa._01_TestPersona;
import junit5.programa._02_TestBrujo;
import junit5.programa._03_TestProducto;
import junit5.programa._04_TestProductoParametros;

/*
 * Si tenemos varias clases con test que queremos ejecutar, podemos crear
 * una clase "Suite" que sea la encargada de ejecutar todas las clases
 * con test que queramos.
 */

@RunWith(Suite.class)
//Aqui podemos poner todas las clases con test que tengamos
@SuiteClasses({
        _01_Asserciones.class,
        _00_Anotaciones.class,
        _01_TestPersona.class,
        _02_TestBrujo.class,
        _03_TestProducto.class,
        _04_TestProductoParametros.class,})

public class _02_AllTests {

}