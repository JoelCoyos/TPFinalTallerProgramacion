package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Factory.TitularFactory;
import junit.framework.Assert;
import Modelo.Titular;

public class TestTitularFactory {
	
	//No se agrega un atributo de la clase a testear, porque solo tiene un método y es estático.
	//No hace falta instanciar la clase.

	@Before
	public void setUp() throws Exception {
		//No hay que setear ningun escenario, porque la clase no tiene estados particulares.
		//Solo por precondicion, debe haber una instancia de la clase Empresa, pero eso está fuera del alcance de esta clase.
	}

	@After
	public void tearDown() throws Exception {
		//No hay nada que reestablecer, por lo escrito en el setUp().
	}

	@Test
	public void testGetTitularFisicoEfectivo() {
		
		String tipo = "Fisico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Efectivo";
		
		//no se si esta bien testear así, haciendo cast, porque si no no hay otra forma de saber si el titular es fisico o juridico.
		//igual esto lo vi viendo el codigo fuente, porque en la docu no decia tan explicitamente que podia devolver 2 subtipos de Titular.
		//Y la clase Titular no tiene justamente un .getTipo, si no que queda establecido por ser TitularFisico o TitularJuridico.
		//TitularFisico t = (TitularFisico) TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		//AA sisi tenia un .getTipo jeje
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		//Nota: podemos usar métodos de otras clases porque previamente ya fueron testeados
		//(en este caso los metodos de Titular)
		//(por eso el enunciado del tp dice que empecemos testeando las clases más atómicas)
	}
	
	@Test
	public void testGetTitularFisicoCheque() {
		
		String tipo = "Fisico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Cheque";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularFisicoTarjeta() {
		
		String tipo = "Fisico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoEfectivo() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Efectivo";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoCheque() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Cheque";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoTarjeta() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoTarjetaLimiteDNI() { //habría que ver si hacer todos los casos límite.
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 1;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		Assert.assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		Assert.assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		Assert.assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		Assert.assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}

}

