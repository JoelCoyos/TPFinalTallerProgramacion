package CajaBlanca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;

public class TestEmpresa {

	private Empresa empresa;
	
	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {
		this.empresa=null;
	}
	
	/**
	 * Se testea el metodo detalle cuando no hay titulares en la Empresa.
	 */
	
	@Test
	public void testDetalle1() {
		this.empresa= Empresa.getInstance();
		ArrayList<Titular> titulares= empresa.getTitualares();
		if (titulares.size()==0)
			empresa.detalle();
		else
			fail("La empresa no deberia tener titulares");
		
	}
	
	
	/**
	 * Se testea el metodo detalle cuando hay titulares registrados en la Empresa.
	 */
	
	@Test
	public void testDetalle2() {
		this.empresa= Empresa.getInstance();
		ArrayList<Titular> titulares= empresa.getTitualares();
		Titular titular1= new TitularFisico("Anibal Pachano",18965478,"Efectivo");
		titular1.addDomicilio("Salta 563", "Internet100", true, false, true);
		this.empresa.addTitular(titular1);
		Titular titular2= new TitularFisico("Andres Juan",41050236,"Tarjeta"); 
		titular1.addDomicilio("Barcelona 5152", "Internet100", false, false, true);
		titular1.addDomicilio("Rosales 1291", "Internet500", true, false, true);
		this.empresa.addTitular(titular2);
		if (titulares.size()==0)
			fail("La empresa no tiene titulares");
		else {
			empresa.detalle();
		}
		
	}

}
