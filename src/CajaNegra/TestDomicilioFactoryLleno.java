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
import Modelo.TitularJuridico;

/**
 * Esceario con datos
 * @author Grupo 4
 *
 */
public class TestDomicilioFactoryLleno {
	
	
	private Titular titular1;
	private Titular titular2;
	
	
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
		//Este seria el setUP para ambos metodos.
		//No lo ponemos en el metodo setUp() como tal ya que como la empresa es Singleton,
		//al ejecutarse 2 veces el setup (uno para cada metodo test), intentaria agregar 2 veces el mismo domicilio, y nos daba incoherencias.
		titular1= new TitularFisico("Mario Donato",39520966,"Efectivo");
		Empresa.getInstance().addTitular(titular1);
		titular1.addDomicilio("Mitre 457", "Internet100", true, false, true);
		titular2= new TitularJuridico("Mario Eduardo",41256333,"Tarjeta");
		Empresa.getInstance().addTitular(titular2);
		titular2.addDomicilio("Rosales 567", "Internet100", true, false, true);
		
		Domicilio d = null;
		try {
			d = DomicilioFactory.getDomicilio("Gaboto 8168","Internet500",true,false,true);
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
			Domicilio d = DomicilioFactory.getDomicilio("Rosales 567", "Internet500", true,true, true);
			fail("No se deberia crear la instancia de domicilio por que ya existe para un titular de una empresa");
		} catch (DomicilioRepetidoException e) {
			
		}
	}

}
