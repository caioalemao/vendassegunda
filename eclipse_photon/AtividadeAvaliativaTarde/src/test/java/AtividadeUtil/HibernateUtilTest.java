package AtividadeUtil;

import org.hibernate.Session;
import org.junit.Test;

import Util.HibernateUtil;





public class HibernateUtilTest {
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaSessoes().openSession();
		sessao.close();

	}
}
