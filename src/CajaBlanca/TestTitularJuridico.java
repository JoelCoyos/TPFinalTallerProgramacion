package CajaBlanca;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.TitularJuridico;




public class TestTitularJuridico {

	private TitularJuridico t;
	
	@Before
	public void setUp() throws Exception {
		//los escenarios se plantearon directamente en los metodos test (para no hacer 4 clases aparte)
	}

	@After
	public void tearDown() throws Exception {
		this.t=null;
	}

	//Se verifica si getCosto devuelve el valor esperado cuando el tipo de pago es con Efectivo
	@Test
	public void testGetCostoFinalEfectivo() {
		
		//setUP Escenario 1.
		this.t = new TitularJuridico("Josefina",40208963,"Efectivo");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(765.00, t.getCostoFinal(),0);
	}
	
	//Se verifica si getCosto devuelve el valor esperado cuando el tipo de pago es con Tarjeta
	@Test
	public void testGetCostoFinalTarjeta() {
		
		//setUP Escenario 2.
		this.t = new TitularJuridico("Josefina",40208963,"Tarjeta");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(1020.00, t.getCostoFinal(),0);
	}
	
	//Se verifica si getCosto devuelve el valor esperado cuando el tipo de pago es con Cheque
	@Test
	public void testGetCostoFinalCheque() {
		
		//setUP Escenario 3.
		this.t = new TitularJuridico("Josefina",40208963,"Cheque");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(977.50, t.getCostoFinal(),0);
	}
	
	//Se verifica si getCosto devuelve el valor esperado cuando el tipo de pago es con Bono
	@Test
	public void testGetCostoFinalBono() {
		
		//setUP Escenario 4.
		this.t = new TitularJuridico("Josefina",40208963,"Bono");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(850.00, t.getCostoFinal(),0);
	}

}
