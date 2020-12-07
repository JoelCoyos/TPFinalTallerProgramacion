package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Decorator.DecoratorCelular;
import Interfaces.IContratacion;
import Modelo.Internet100;
import Modelo.Internet500;

public class TestDecoratorCelular {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	//Factura con la contratacion internet 100
	@Test
	public void testGetFactura1() {
		IContratacion contrato = null;
		contrato = new Internet100();
		contrato = new DecoratorCelular(contrato);
		assertEquals("Internet 100 + Celular", contrato.getFactura());
		
	}
	
	//Factura con la contratacion internet 500
	@Test
	public void testGetFactura2() {
		IContratacion contrato = null;
		contrato = new Internet500();
		contrato = new DecoratorCelular(contrato);
		assertEquals("Internet 500 + Celular", contrato.getFactura());
		
	}
	
	//Costo de Internet 100 con celular, 850 + 300
	@Test
	public void testGetCosto1() {
		IContratacion contrato = null;
		contrato = new Internet100();
		contrato = new DecoratorCelular(contrato);
		assertEquals(1150, (int)contrato.getCosto());
		
	}
	
	//Costo de Internet 500 con celular, 1000 + 300
	@Test
	public void testGetCosto2() {
		IContratacion contrato = null;
		contrato = new Internet500();
		contrato = new DecoratorCelular(contrato);
		assertEquals(1300, (int)contrato.getCosto());
		
	}

}
