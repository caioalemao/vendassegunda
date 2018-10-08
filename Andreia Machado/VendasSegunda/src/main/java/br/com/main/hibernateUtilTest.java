package br.com.main;

import org.hibernate.Session;

import br.com.vendassegunda.util.hibernateUtil;

public class hibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = hibernateUtil.getFabricaSessoes().openSession();

		sessao.close();

		hibernateUtil.getFabricaSessoes().close();
	}
}
