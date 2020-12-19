package CajaBlanca;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;
import Modelo.TitularJuridico;

public class TestEmpresa2 {
	
	private Empresa empresa;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		this.empresa=null;
	}

	//Se solicita el duplicado de un Titular Fisico
	@Test
	public void testSolicitarDuplicado1() {
		this.empresa= Empresa.getInstance();
		Titular titular= new TitularFisico("Enzo Barria",41120666,"Tarjeta"); 
		titular.addDomicilio("Santa Clara 5152", "Internet500", false, false, true);
		titular.addDomicilio("Santiago del Estero 633", "Internet500", true, false, true);
		this.empresa.addTitular(titular);
		int nroId= titular.getNroIdentacion();
		Titular clonado= this.empresa.solicitaDuplicado(nroId);
		if (clonado==null) {
			fail("El titular se debio clonar correctamente por que estaba registrado en la empresa y era fisico");
		}
		else {
			assertEquals("El nombre del titular clonado es  incorrecto",titular.getNombre() ,clonado.getNombre());
			assertEquals("El DNI del titular clonado es incorrecto",titular.getDni() ,clonado.getDni());
			assertEquals("El tipo de pago del titular clonado es incorrecto",titular.getTipoDePago() ,clonado.getTipoDePago());
		}
		
	}
	
	/**
	 * Se solicita el duplicado de un Titular Juridico 
	 */
	
	@Test
	public void testSolicitarDuplicado2() {
		
		this.empresa= Empresa.getInstance();
		Titular titular= new TitularJuridico("Mike Wazowsky S.A",42336699,"Efectivo"); 
		titular.addDomicilio("Guemes 2559", "Internet500", true, true, true);
		this.empresa.addTitular(titular);
		int nroId= titular.getNroIdentacion();
		Titular clonado= this.empresa.solicitaDuplicado(nroId);
		if (clonado!=null) {
			fail("No se debio clonar por que el titular era juridico");
		}
	}
}
