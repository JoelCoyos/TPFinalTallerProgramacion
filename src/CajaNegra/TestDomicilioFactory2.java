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

/**
 * Escenario sin datos
 * @author Grupo4
 *
 */
public class TestDomicilioFactory2 {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
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
		
	}
	

}
