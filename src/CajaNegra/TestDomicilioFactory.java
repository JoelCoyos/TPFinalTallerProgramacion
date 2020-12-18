package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Excepciones.DomicilioRepetidoException;
import Factory.DomicilioFactory;
import Modelo.Domicilio;
import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;

public class TestDomicilioFactory {
	
	private Empresa e;

	@Before
	public void setUp() throws Exception {
		this.e= Empresa.getInstance();
		Titular titular= new TitularFisico("Mario Donato",39520966,"Efectivo");
		titular.addDomicilio("Mitre 455", "Internet100", true, false, true);
		this.e.addTitular(titular);
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
		try {
			Domicilio d= DomicilioFactory.getDomicilio("Gaboto 8168","Internet500",true,false,true);
			assertEquals("El Domicilio generado no es correcto", "Gaboto 8168", d.getDireccion());
		} catch (DomicilioRepetidoException e) {
			fail("No se deberia caer en DomicilioRepetidoException por que el domicilio generado no existia para ningun titular en la empresa");
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
