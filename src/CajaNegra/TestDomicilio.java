package CajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Decorator.DecoratorCelular;
import Decorator.DecoratorTelFijo;
import Decorator.DecoratorTv;
import junit.framework.Assert;
import Modelo.Domicilio;
import Modelo.Internet100;
import Modelo.Internet500;

public class TestDomicilio {
	
	private Domicilio domicilio;

	@Before
	public void setUp() throws Exception {
		//no hay escenarios como tal en esta prueba del constructor
	}

	@After
	public void tearDown() throws Exception {
		this.domicilio = null;
	}

	//testeamos solo el constructor
	
	@Test
	public void testDomicilioInternet100() {
		
		String direccion = "Colon 1234";
		Internet100 contrato = new Internet100();
		
		this.domicilio = new Domicilio(direccion, contrato);
		
		Assert.assertEquals("El atributo direccion no se inicializó correctamente.", direccion, this.domicilio.getDireccion());
		Assert.assertEquals("El atributo contrato no se inicializó correctamente.", contrato, this.domicilio.getContrato());
		//verificamos que la referencia de 'contrato' sea la misma que se guardo en el atributo de 'domicilio'.
		
		//System.out.println(contrato);
		//System.out.println(this.domicilio.getContrato());
		//System.out.println(contrato.getClass());
		//System.out.println(this.domicilio.getContrato().getClass());
	}
	
	@Test
	public void testDomicilioInternet500() {
		
		String direccion = "Colon 1234";
		Internet500 contrato = new Internet500();
		
		this.domicilio = new Domicilio(direccion, contrato);
		
		Assert.assertEquals("El atributo direccion no se inicializó correctamente.", direccion, this.domicilio.getDireccion());
		Assert.assertEquals("El atributo contrato no se inicializó correctamente.", contrato, this.domicilio.getContrato());
	}
	
	@Test
	public void testDomicilioCelular() {
		
		String direccion = "Colon 1234";
		DecoratorCelular contrato = new DecoratorCelular(new Internet100()); //lo de internet100 es arbitrario, es solo para instanciar la clase DecoratorCelular.
		
		this.domicilio = new Domicilio(direccion, contrato);
		
		Assert.assertEquals("El atributo direccion no se inicializó correctamente.", direccion, this.domicilio.getDireccion());
		Assert.assertEquals("El atributo contrato no se inicializó correctamente.", contrato, this.domicilio.getContrato());
	}
	
	@Test
	public void testDomicilioTelFijo() {
		
		String direccion = "Colon 1234";
		DecoratorTelFijo contrato = new DecoratorTelFijo(new Internet100());
		
		this.domicilio = new Domicilio(direccion, contrato);
		
		Assert.assertEquals("El atributo direccion no se inicializó correctamente.", direccion, this.domicilio.getDireccion());
		Assert.assertEquals("El atributo contrato no se inicializó correctamente.", contrato, this.domicilio.getContrato());
	}
	
	@Test
	public void testDomicilioTv() {
		
		String direccion = "Colon 1234";
		DecoratorTv contrato = new DecoratorTv(new Internet100());
		
		this.domicilio = new Domicilio(direccion, contrato);
		
		Assert.assertEquals("El atributo direccion no se inicializó correctamente.", direccion, this.domicilio.getDireccion());
		Assert.assertEquals("El atributo contrato no se inicializó correctamente.", contrato, this.domicilio.getContrato());
	}

}

