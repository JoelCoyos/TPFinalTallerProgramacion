package CajaNegra;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;
import Modelo.TitularJuridico;

public class TestEmpresa1 {

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
			System.out.println(titulares.contains(titular));
			assertEquals("Se deber�a haber agregado a la empresa",true,titulares.contains(titular));
		}

		//Se agrega un titular a una empresa con un titular
		@Test
		public void testAddTitular2() {
			TitularJuridico titular2 = new TitularJuridico("Pedro", 789456, "Efectivo");
			Empresa.getInstance().addTitular(titular2);
			ArrayList<Titular> titulares = Empresa.getInstance().getTitualares();
			assertEquals("Se deber�a haber agregado a la empresa",true,titulares.contains(titular2));
		}

}
