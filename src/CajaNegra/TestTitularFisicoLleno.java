package CajaNegra;

//DEBERIA TENER UNA COLECCION DE DOMICILIOS LLENA
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.TitularFisico;

public class TestTitularFisicoLleno {
	
	private TitularFisico titularFisico;
	
	public TestTitularFisicoLleno() {
	
	}

	@Before
	public void setUp() throws Exception {
		titularFisico=new TitularFisico("Enzo",40741852,"Tarjeta");
		titularFisico.addDomicilio("Marconi 1452", "Internet100",true,false,true);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Instancia un titular fisico a través del constructor
	 */
	@Test
	public void testConstructor() {
		titularFisico=new TitularFisico("Josefina",40208741,"Efectivo");
		assertEquals("No genera el nombre","Josefina", titularFisico.getNombre());
		assertEquals("No genera el DNI",40208741,titularFisico.getDni());
		assertEquals("No genera el tipo de pago","Efectivo", titularFisico.getTipoDePago());
	}
	
	/**
	 * Cambia el tipo de pago varias veces
	 */
	@Test
	public void testSetTipoDePago() {
		titularFisico.setTipoDePago("Efectivo");
		assertEquals("No se cambió el tipo de pago",titularFisico.getTipoDePago(),"Efectivo");
		titularFisico.setTipoDePago("Cheque");
		assertEquals("No se cambió el tipo de pago",titularFisico.getTipoDePago(),"Cheque");
		titularFisico.setTipoDePago("Tarjeta");
		assertEquals("No se cambió el tipo de pago",titularFisico.getTipoDePago(),"Tarjeta");
	}
	/**
	 * Clona un titular fisico, debería funcionar sin problemas
	 */
	@Test
	public void testClone() {
		TitularFisico clonado;
		clonado=(TitularFisico) titularFisico.clone();
		assertEquals("No se clonó el nombre",titularFisico.getNombre(),clonado.getNombre());
		assertEquals("No se clonó el DNI",titularFisico.getDni(),clonado.getDni());
		assertEquals("No se clonó el tipo de pago",titularFisico.getTipoDePago(),clonado.getTipoDePago());
		assertEquals("No se clonó el domicilio",titularFisico.getDomicilios().get(0).getDireccion(),clonado.getDomicilios().get(0).getDireccion());
		assertEquals("No se clonó el contrato",titularFisico.getDomicilios().get(0).getContrato(),clonado.getDomicilios().get(0).getContrato());

	}
	
	
	/**
	 * Verifica si el getCosto retorna el valor esperado de la factura de Enzo
	 */
	@Test
	public void testGetCosto1() {
		assertEquals(1400.00, titularFisico.getCosto(),0);
	}
	/**
	 * Agrego tres domicilios para verificar que el método calcula todo lo esperado
	 */
	@Test
	public void testGetCosto2() {
		titularFisico.addDomicilio("Juan B.Justo 4400", "Internet500",false,true,false);
		titularFisico.addDomicilio("Lopez Planes 87", "Internet100",true,false,true);
		titularFisico.addDomicilio("Tucuman 2014", "Internet500",true,true,true);
		assertEquals(5750.00, titularFisico.getCosto(),0);
	}
	
	
	/**
	 * El tipo de pago es Efectivo
	 * Verifica si el getCostoFinal retorna el valor esperado
	 */
	@Test
	public void testGetCostoFinalEfectivo() {
		titularFisico.setTipoDePago("Efectivo");
		assertEquals(1120.00, titularFisico.getCostoFinal(),0);
	}
	
	/**
	 * El tipo de pago es Cheque
	 * Verifica si el getCostoFinal retorna el valor esperado
	 */
	@Test
	public void testGetCostoFinalCheque() {
		titularFisico.setTipoDePago("Cheque");
		assertEquals(1540.00, titularFisico.getCostoFinal(),0);
	}
	
	/**
	 * El tipo de pago es Tarjeta, como el tipo de pago original es tarjeta, no cambio su tipo
	 * Verifica si el getCostoFinal retorna el valor esperado
	 */
	@Test
	public void testGetCostoFinalTarjeta() {
		assertEquals(1400.00, titularFisico.getCostoFinal(),0);
	}
	/**
	 * Agrego un domicilio que no esta en la coleccion de domicilios llena
	 */
	@Test
	public void testAddDomicilioNoRepetido() { 
		titularFisico.addDomicilio("Maipu 67", "Internet500",false,true,false);
		assertEquals("No se agregó el domicilio",titularFisico.getDomicilios().get(1).getDireccion(),"Maipu 67");
	}
	/**
	 * Agrego un domicilio que ya esta en la colección de domicilios
	 * Uso el tamaño de la coleccion porque sé que hay un solo domicilio
	 */
	@Test
	public void testAddDomicilioRepetido() {
		titularFisico.addDomicilio("Marconi 1452", "Internet100",true,false,true);
		assertTrue(titularFisico.getDomicilios().size()==1);
	}
}
