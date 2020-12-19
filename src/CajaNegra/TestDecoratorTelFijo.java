package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Decorator.DecoratorTelFijo;
import junit.framework.Assert;
import Modelo.Internet100;
import Modelo.Internet500;

public class TestDecoratorTelFijo {
	
	private DecoratorTelFijo d;

	@Before
	public void setUp() throws Exception {
		//Lo ideal hubiera sido crear 2 clases Escenario y 2 clases TestDecorator
		//ya que tenemos 2 escenarios diferentes, pero bueno lo unifiqu� todo en una clase.
	}

	@After
	public void tearDown() throws Exception {
		this.d = null;
	}

	@Test
	public void testGetFacturaInternet100() {
		//Estas 2 lineas ser�an el setUp del escenario 1.
		Internet100 i = new Internet100();
		this.d = new DecoratorTelFijo(i);
		
		//el string que deberiamos recibir
		String cadena = "Internet 100 + Telefono Fijo";
		
		assertEquals("El string de factura recibido no es el esperado.", cadena, d.getFactura());
	}
	
	@Test
	public void testGetFacturaInternet500() {
		//estas 2 lineas ser�an el setUp del escenario 2.
		Internet500 i = new Internet500();
		this.d = new DecoratorTelFijo(i);
		
		//el string que deberiamos recibir
		String cadena = "Internet 500 + Telefono Fijo";
		
		assertEquals("El string de factura recibido no es el esperado.", cadena, d.getFactura());
	}
	
	@Test
	public void testGetCostoInternet100() {
		//estas 2 lineas ser�an el setUp del escenario 1.
		Internet100 i = new Internet100();
		this.d = new DecoratorTelFijo(i);
		
		//el costo que deberiamos recibir
		double costo = 850 + 200;
		
		assertEquals("El costo recibido no es el correcto.", costo, d.getCosto(),0);
	}
	
	@Test
	public void testGetCostoInternet500() {
		//estas 2 lineas ser�an el setUp del escenario 2.
		Internet500 i = new Internet500();
		this.d = new DecoratorTelFijo(i);
		
		//el costo que deberiamos recibir
		double costo = 1000 + 200;
		
		assertEquals("El costo recibido no es el correcto.", costo, d.getCosto(),0);
	}

}
