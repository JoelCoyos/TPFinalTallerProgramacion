package CajaNegra;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.TitularFisico;

public class TestTitularFisico {
	
	private TitularFisico titularFisico;
	
	public TestTitularFisico() {
	
	}

	@Before
	public void setUp() throws Exception {
		titularFisico=new TitularFisico("Enzo",40741852,"Tarjeta");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Instancio un titular fisico a través del constructor
	 */
	@Test
	public void testConstructor() {
		titularFisico=new TitularFisico("Josefina",40208741,"Efectivo");
		assertEquals("No genera el nombre","Josefina", titularFisico.getNombre());
		assertEquals("No genera el DNI",40208741,titularFisico.getDni());
		assertEquals("No genera el tipo de pago","Efectivo", titularFisico.getTipoDePago());
	}
	/**
	 * Clono un titular fisico, debería funcionar sin problemas
	 */
	@Test
	public void testClone() {
		TitularFisico clonado;
		clonado=(TitularFisico) titularFisico.clone();
		assertEquals("No se clonó el nombre",titularFisico.getNombre(),clonado.getNombre());
		assertEquals("No se clonó el DNI",titularFisico.getDni(),clonado.getDni());
		assertEquals("No se clonó el tipo de pago",titularFisico.getTipoDePago(),clonado.getTipoDePago());
	}
	
	/**
	 * Agrego un domicilio no repetido a la colección de domicilios
	 */
	@Test
	public void testAddDomicilioNoRepetido() {
		
		titularFisico.addDomicilio("Marconi 1452", "Internet100",true,false,true);
		assertEquals("No se agregó el domicilio",titularFisico.getDomicilios().get(0).getDireccion(),"Marconi 1452");
	}
	/**
	 * Agrego un domicilio repetido a la colección de domicilios
	 */
	@Test
	public void testAddDomicilioRepetido() {
		
		fail("Not yet implemented");
	}
	/**
	 * Cambio el tipo de pago varias veces
	 */
	@Test
	public void testSetTipoDePago() {
		fail("Not yet implemented");
	}
	/**
	 * Hay que ver si el getCosto retorna el valor esperado
	 */
	@Test
	public void testGetCosto() {
		fail("Not yet implemented");
	}
	

}
