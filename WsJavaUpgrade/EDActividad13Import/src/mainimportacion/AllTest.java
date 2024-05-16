package mainimportacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;



	
	@Suite
	@SelectClasses({Pruebajugador.class, PruebaSoldado,class)}
	public class AllTest{
		
	}

