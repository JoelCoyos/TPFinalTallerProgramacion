package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Factory.TitularFactory;
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
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularFisicoCheque() {
		
		String tipo = "Fisico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Cheque";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularFisicoTarjeta() {
		
		String tipo = "Fisico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoEfectivo() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Efectivo";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoCheque() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Cheque";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoTarjeta() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 41123456;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}
	
	@Test
	public void testGetTitularJuridicoTarjetaLimiteDNI() {
		
		String tipo = "Juridico";
		String nombre = "Juan";
		int dni = 1;
		String tipoDePago = "Tarjeta";
		
		Titular t = TitularFactory.getTitular(tipo, nombre, dni, tipoDePago);
		assertEquals("No se asignó correctamente el tipo del Titular", tipo, t.getTipo());
		assertEquals("No se asignó correctamente el nombre del Titular", nombre, t.getNombre());
		assertEquals("No se asignó correctamente el dni del Titular", dni, t.getDni());
		assertEquals("No se asignó correctamente el tipoDePago del Titular", tipoDePago, t.getTipoDePago());
		
	}

}

