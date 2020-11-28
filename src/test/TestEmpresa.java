package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;
import Modelo.TitularJuridico;

public class TestEmpresa {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//Se agrega un titular a una empresa sin titulares
	@Test
	public void testAddTitular1() {
		TitularFisico titular = new TitularFisico("Juan", 123456, "Efectivo");
		Empresa.getInstance().addTitular(titular);
		ArrayList<Titular> titulares = Empresa.getInstance().getTitualares();
		assertEquals("Juan", titulares.get(0).getNombre());
		assertEquals("Se debería haber agregado a la empresa", 123456, titulares.get(0).getDni());
	}

	//Se agrega un titular a una empresa con un titular
	@Test
	public void testAddTitular2() {
		TitularJuridico titular2 = new TitularJuridico("Pedro", 789456, "Efectivo");
		Empresa.getInstance().addTitular(titular2);
		ArrayList<Titular> titulares = Empresa.getInstance().getTitualares();
		assertEquals("Pedro", titulares.get(1).getNombre());
		assertEquals("Se debería haber agregado a la empresa", 789456, titulares.get(1).getDni());
	}

	// Solicita un titular no juridico con un nro de identifacion valido
	@Test
	public void testSolicitaDuplicado1() {
		TitularFisico titular = new TitularFisico("Marcos", 123456, "Efectivo");
		Empresa.getInstance().addTitular(titular);
		int nroIdent = titular.getNroIdentacion();
		Titular copia = Empresa.getInstance().solicitaDuplicado(nroIdent);
		assertEquals("Se tendría que haber duplicado", "Marcos", copia.getNombre());

	}

	// Solicita un titular juridico con un nro de identifacion valido
	@Test
	public void testSolicitaDuplicado2() {
		TitularJuridico titular = new TitularJuridico("Gonzalo", 123456, "Efectivo");
		Empresa.getInstance().addTitular(titular);
		int nroIdent = titular.getNroIdentacion();
		Titular copia = Empresa.getInstance().solicitaDuplicado(nroIdent);
		assertEquals("La copia debería ser null", null, copia);

	}

}
