package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Decorator.DecoratorCelular;
import Decorator.DecoratorTv;
import Interfaces.IContratacion;
import Modelo.Internet100;
import Modelo.Internet500;

public class TestDecoratorTv {

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
			contrato = new DecoratorTv(contrato);
			assertEquals("Internet 100 + TV-Cable", contrato.getFactura());
			
		}
		
		//Factura con la contratacion internet 500
		@Test
		public void testGetFactura2() {
			IContratacion contrato = null;
			contrato = new Internet500();
			contrato = new DecoratorTv(contrato);
			assertEquals("Internet 500 + TV-Cable", contrato.getFactura());
			
		}
		
		//Costo de Internet 100 con celular, 850 + 250
		@Test
		public void testGetCosto1() {
			IContratacion contrato = null;
			contrato = new Internet100();
			contrato = new DecoratorTv(contrato);
			assertEquals(1100, (int)contrato.getCosto());
			
		}
		
		//Costo de Internet 500 con celular, 1000 + 250
		@Test
		public void testGetCosto2() {
			IContratacion contrato = null;
			contrato = new Internet500();
			contrato = new DecoratorTv(contrato);
			assertEquals(1250, (int)contrato.getCosto());
			
		}
}
