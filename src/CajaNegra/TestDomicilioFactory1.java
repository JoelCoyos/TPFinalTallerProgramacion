package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Esceario con datos
 * @author Grupo 4
 *
 */
public class TestDomicilioFactory1 {
	
	private Empresa e;
	private Titular titular1;
	private Titular titular2;
	
	
	@Before
	public void setUp() throws Exception {
		this.e= Empresa.getInstance();
		Titular titular1= new TitularFisico("Mario Donato",39520966,"Efectivo");
		titular1.addDomicilio("Mitre 455", "Internet100", true, false, true);
		this.e.addTitular(titular1);
		titular2= new TitularJuridico("Mario Eduardo",41256333,"Tarjeta");
		titular2.addDomicilio("Rosales 565", "Internet100", true, false, true);
		this.e.addTitular(titular2);
	}

	@After
	public void tearDown() throws Exception {
		this.e= null;
	}

	/**
	 * Este metodo testea el caso de que se cree una instancia de domicilio inexistente en la empresa para un titular valido.
	 */
	
	@Test
	public void testGetDomicilio1() {
		Domicilio d=null;
		try {
			d= DomicilioFactory.getDomicilio("Gaboto 8168","Internet500",true,false,true);
			assertEquals("El Domicilio generado no es correcto", "Gaboto 8168", d.getDireccion());
		} catch (DomicilioRepetidoException e) {
			fail("No se deberia caer en DomicilioRepetidoException por que el domicilio generado no existia para ningun titular en la empresa");
		}
		if (d!=null) {
			titular2.addDomicilio("Gaboto 8168","Internet500",true,false,true);
		}
	}
	
	/**
	 * Este metodo testea el caso de que se cree una instancia de domicilio existente en la empresa para un titular valido.
	 */
	
	@Test
	public void testGetDomicilio2() {
		try {
			Domicilio d= DomicilioFactory.getDomicilio("Gaboto 8168","Internet500",true,false,true);
			fail("No se deberia crear la instancia de domicilio por que ya existe para un titular de una empresa");
		} catch (DomicilioRepetidoException e) {
			
		}
	}

}
