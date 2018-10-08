package br.com.vendassegunda.util;

import org.hibernate.Session;
import org.junit.Test;


public class HibernateUtilTest {
	@Test
	public void conectar() {
		Session sessao = hibernateUtil.getFabricaSessoes().openSession();
		sessao.close();

	}
}
