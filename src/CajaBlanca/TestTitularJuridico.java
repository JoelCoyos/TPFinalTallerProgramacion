package CajaBlanca;


import static org.junit.Assert.assertEquals;
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

	@Test
	public void testGetCostoFinalEfectivo() {
		
		//setUP Escenario 1.
		this.t = new TitularJuridico("Josefina",40208963,"Efectivo");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(765.00, t.getCostoFinal(),0);
	}
	
	@Test
	public void testGetCostoFinalTarjeta() {
		
		//setUP Escenario 2.
		this.t = new TitularJuridico("Josefina",40208963,"Tarjeta");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(1020.00, t.getCostoFinal(),0);
	}
	
	@Test
	public void testGetCostoFinalCheque() {
		
		//setUP Escenario 3.
		this.t = new TitularJuridico("Josefina",40208963,"Cheque");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(977.50, t.getCostoFinal(),0);
	}
	
	@Test
	public void testGetCostoFinalBono() {
		
		//setUP Escenario 4.
		this.t = new TitularJuridico("Josefina",40208963,"Bono");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(850.00, t.getCostoFinal(),0);
	}
	/*@Test
	public void testClone() {
		
		//setUP Escenario 1 (del caso de prueba de clone).
		this.t = new TitularFisico("Juan",41123456,"Cheque");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		
		TitularFisico clon = (TitularFisico) this.t.clone();
		
		Assert.assertEquals("El nombre no se clonó correctamente.", this.t.getNombre(), clon.getNombre());
		Assert.assertEquals("El dni no se clonó correctamente.", this.t.getDni(), clon.getDni());
		Assert.assertEquals("El tipo de pago no se clonó correctamente.", this.t.getTipoDePago(), clon.getTipoDePago());
		Assert.assertEquals("El domicilio no se clonó correctamente.", this.t.getDomicilios(), clon.getDomicilios());
		//no se bien como funciona internamente el equals con Arrays, quizas se fija que los elementos sean iguales, y no las referencias.
		//porque o sea, no me da error, por lo que descartado que compruebe referencias en este caso, creo, porque al clonar, se hacen referencias distintas.
		//System.out.println(this.t.getDomicilios());
		//System.out.println(clon.getDomicilios());
		//ahi probe de ver que me mostraba, y muestra los toString de los Domicilio, quizas compare eso, o sino los atributos en sí.
	}*/


}
