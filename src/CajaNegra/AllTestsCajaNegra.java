package CajaNegra;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDecoratorCelular.class, TestDecoratorTelFijo.class, TestDecoratorTv.class, TestDomicilio.class,
		TestDomicilioFactoryLleno.class, TestDomicilioFactoryVacio.class, TestEmpresa1.class, TestEmpresa2.class,
		TestTitularFactory.class, TestTitularFisicoLleno.class, TestTitularFisicoVacio.class, TestTitularJuridico.class })
public class AllTestsCajaNegra {

}
