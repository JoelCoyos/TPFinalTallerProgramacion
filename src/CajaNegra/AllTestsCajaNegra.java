package CajaNegra;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDecoratorCelular.class, TestDecoratorTelFijo.class, TestDecoratorTv.class, TestDomicilio.class,
		TestDomicilioFactory1.class, TestDomicilioFactory2.class, TestEmpresa1.class, TestEmpresa2.class,
		TestTitularFactory.class, TestTitularFisico1.class, TestTitularFisico2.class, TestTitularJuridico.class })
public class AllTestsCajaNegra {

}
