package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.TitularFisico;

public class TestTitularFisicoVacio {

private TitularFisico titularFisico;
	
	public TestTitularFisicoVacio() {
	
	}

	@Before
	public void setUp() throws Exception {
		titularFisico=new TitularFisico("Enzo",40741852,"Tarjeta");
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Agrego domicilio a la coleccion de domicilios vacia
	 */
	@Test
	public void testAddDomicilioNoRepetido() { 
		titularFisico.addDomicilio("Marconi 1452", "Internet100",true,false,true);
		assertEquals("No se agregó el domicilio",titularFisico.getDomicilios().get(0).getDireccion(),"Marconi 1452");
	}
}