package main;

import org.hibernate.Session;

import Util.HibernateUtil;



public class HibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaSessoes().openSession();

		sessao.close();

		HibernateUtil.getFabricaSessoes().close();
	}
}
