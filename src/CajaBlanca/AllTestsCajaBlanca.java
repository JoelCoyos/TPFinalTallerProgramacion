package CajaBlanca;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestEmpresa1.class, TestEmpresa2.class, TestTitularFisico.class, TestTitularJuridico.class })
public class AllTestsCajaBlanca {

}
