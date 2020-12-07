package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Excepciones.DomicilioRepetidoException;
import Factory.DomicilioFactory;
import Modelo.Domicilio;
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
	
	@Test
	public void testCostoFinal1() {
		TitularJuridico titularJuridico = new TitularJuridico("Juan", 123456, "Efectivo");
		titularJuridico.addDomicilio("Independencia 1234", "Internet100", true, false, false);
		int costo = (int) titularJuridico.getCosto();
		assertEquals(costo*0.9, titularJuridico.getCostoFinal(),0);
	}
	
	@Test
	public void testCostoFinal2() {
		TitularJuridico titularJuridico = new TitularJuridico("Juan", 123456, "Cheque");
		titularJuridico.addDomicilio("Independencia 1234", "Internet100", true, false, false);
		int costo = (int) titularJuridico.getCosto();
		assertEquals(costo*1.15, titularJuridico.getCostoFinal(),0);
	}
	
	@Test
	public void testCostoFinal3() {
		TitularJuridico titularJuridico = new TitularJuridico("Juan", 123456, "Tarjeta");
		titularJuridico.addDomicilio("Independencia 1234", "Internet100", true, false, false);
		int costo = (int) titularJuridico.getCosto();
		assertEquals(costo*1.2, titularJuridico.getCostoFinal(),0);
	}
	
	
	
	
}
