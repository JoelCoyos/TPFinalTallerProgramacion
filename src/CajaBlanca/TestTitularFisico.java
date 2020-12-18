package CajaBlanca;

//PRUEBA DE CAJA BLANCA - Cobertura
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Domicilio;
import Modelo.TitularFisico;

public class TestTitularFisico {
	
	private TitularFisico t;

	@Before
	public void setUp() throws Exception {
		//los escenarios se plantearon directamente en los metodos test (para no hacer 3 clases aparte)
	}

	@After
	public void tearDown() throws Exception {
		this.t = null;
	}
	
	@Test
	public void testAddDomicilio1()
	{
		this.t=new TitularFisico("Juan", 12345678, "Efectivo");
		t.addDomicilio("Independencia 1234", "Internet100", true, true, false);
		Domicilio domicilio = t.getDomicilios().get(0);
		assertEquals("Independencia 1234", domicilio.getDireccion());
	}
	
	@Test
	public void testAddDomicilio2()
	{
		this.t=new TitularFisico("Juan", 12345678, "Efectivo");
		t.addDomicilio("Independencia 1234", "Internet100", true, true, false);
		t.addDomicilio("Independencia 1234", "Internet100", true, true, false);
		assertEquals(1, t.getDomicilios().size());
	}
	
	@Test
	public void testGetCosto1()
	{
		this.t=new TitularFisico("Juan", 12345678, "Efectivo");
		t.addDomicilio("Independencia 1234", "Internet100", false, false, false);
		t.addDomicilio("Independencia 1235", "Internet100", false, false, false);
		assertEquals(1700, t.getCosto(),0);
	}
	
	@Test
	public void testGetCosto2()
	{
		this.t=new TitularFisico("Juan", 12345678, "Efectivo");
		assertEquals(0, t.getCosto(),0);
	}

	@Test
	public void testGetCostoFinalEfectivo() {
		
		//setUP Escenario 1.
		this.t = new TitularFisico("Juan",41123456,"Efectivo");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(680.00, t.getCostoFinal(),0);
	}
	
	@Test
	public void testGetCostoFinalTarjeta() {
		
		//setUP Escenario 2.
		this.t = new TitularFisico("Juan",41123456,"Tarjeta");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		assertEquals(850.00, t.getCostoFinal(),0);
	}
	
	@Test
	public void testGetCostoFinalCheque() {
		
		//setUP Escenario 3.
		this.t = new TitularFisico("Juan",41123456,"Cheque");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);	
		assertEquals(935.00, t.getCostoFinal(),0);
	}
	
	@Test
	public void testClone() {
		
		//setUP Escenario 1 (del caso de prueba de clone).
		this.t = new TitularFisico("Juan",41123456,"Cheque");
		this.t.addDomicilio("Colon 1234", "Internet100", false, false, false);
		TitularFisico clon = (TitularFisico) this.t.clone();
		assertEquals("El nombre no se clon� correctamente.", this.t.getNombre(), clon.getNombre());
		assertEquals("El dni no se clon� correctamente.", this.t.getDni(), clon.getDni());
		assertEquals("El tipo de pago no se clon� correctamente.", this.t.getTipoDePago(), clon.getTipoDePago());
		assertEquals("El domicilio no se clon� correctamente.", this.t.getDomicilios(), clon.getDomicilios());
		//no se bien como funciona internamente el equals con Arrays, quizas se fija que los elementos sean iguales, y no las referencias.
		//porque o sea, no me da error, por lo que descartado que compruebe referencias en este caso, creo, porque al clonar, se hacen referencias distintas.
		//System.out.println(this.t.getDomicilios());
		//System.out.println(clon.getDomicilios());
		//ahi probe de ver que me mostraba, y muestra los toString de los Domicilio, quizas compare eso, o sino los atributos en s�.
	}

}
