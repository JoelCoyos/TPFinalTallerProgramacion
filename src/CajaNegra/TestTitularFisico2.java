package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.TitularFisico;
//COLECCION DE DOMICILIOS VACIA
public class TestTitularFisico2 {

private TitularFisico titularFisico;
	
	public TestTitularFisico2() {
	
	}

	@Before
	public void setUp() throws Exception {
		titularFisico=new TitularFisico("Enzo",40741852,"Tarjeta");
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Agrego domicilio que no esta en la coleccion de domicilios
	 */
	@Test
	public void testAddDomicilioNoRepetido() { 
		titularFisico.addDomicilio("Marconi 1452", "Internet100",true,false,true);
		assertEquals("No se agregó el domicilio",titularFisico.getDomicilios().get(0).getDireccion(),"Marconi 1452");
	}
}