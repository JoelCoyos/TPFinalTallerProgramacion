package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Titular;
import Modelo.TitularJuridico;

public class TestTitularJuridico {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testClone() {
		TitularJuridico titularJuridico = new TitularJuridico("Juan", 123456, "Efectivo");
		try {
			Titular cloneTitular = (Titular) titularJuridico.clone();
			fail("Tendría que haber arrojado excepcion");
		} catch (CloneNotSupportedException e) {
			
		}
	}
}
