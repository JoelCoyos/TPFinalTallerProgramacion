package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Empresa;
import Modelo.Titular;
import Modelo.TitularFisico;
import Modelo.TitularJuridico;

public class TestEmpresa2 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// Solicita un titular no juridico con un nro de identifacion valido
		@Test
		public void testSolicitaDuplicado1() {
			TitularFisico titular = new TitularFisico("Marcos", 123456, "Efectivo");
			Empresa.getInstance().addTitular(titular);
			int nroIdent = titular.getNroIdentacion();
			Titular copia = Empresa.getInstance().solicitaDuplicado(nroIdent);
			assertEquals("Se tendr�a que haber duplicado", "Marcos", copia.getNombre());
			assertEquals("Se tendr�a que haber duplicado", 123456, copia.getDni());
			assertEquals("Se tendr�a que haber duplicado", "Efectivo", copia.getTipoDePago());


		}

		// Solicita un titular juridico con un nro de identifacion valido
		@Test
		public void testSolicitaDuplicado2() {
			TitularJuridico titular = new TitularJuridico("Gonzalo", 123456, "Efectivo");
			Empresa.getInstance().addTitular(titular);
			int nroIdent = titular.getNroIdentacion();
			Titular copia = Empresa.getInstance().solicitaDuplicado(nroIdent);
			assertEquals("La copia deber�a ser null", null, copia);

		}

}
