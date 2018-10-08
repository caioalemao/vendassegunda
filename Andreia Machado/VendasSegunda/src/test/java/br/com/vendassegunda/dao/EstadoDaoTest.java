package br.com.vendassegunda.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.vendassegunda.dao.EstadoDao;
import br.com.vendassegunda.domain.Estado;

public class EstadoDaoTest {
	@Ignore
	@Test
	public void salvar() {
		
		Estado estado = new Estado();
		estado.setNome("SÃO PAULO");
		estado.setSigla("SP");
		
		EstadoDao estadoDao = new EstadoDao();
		estadoDao.salvar(estado);
		
	}
	@Test
	@Ignore
	public void listar() {
		
		EstadoDao estadoDao = new EstadoDao();
		List<Estado> resultado =  estadoDao.listar();
		
		System.out.println("total de Registros: "+ resultado.size());
		
		for (Estado estado: resultado) {
			System.out.println(estado.getNome()+"-"+estado.getSigla());
		}
	}
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 2L;

		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum Registro Encontrado");

		} else {

			System.out.println("Registro encontrado");
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
		
	}
	@Test
	public void excluir() {
		Long codigo = 5L;

		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum Registro Encontrado");

		} else {

			estadoDao.excluir(estado);
			System.out.println("Registro removido");
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
		
	}
	
}
