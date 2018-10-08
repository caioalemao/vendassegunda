package br.com.vendassegunda.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.vendassegunda.domain.Cidade;
import br.com.vendassegunda.domain.Estado;

public class CidadeDaoTest {
	@Ignore
	@Test
	public void salvar() {
		
		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(1L);
		
		Cidade cidade = new Cidade();
		cidade.setNome("Assis");
		cidade.setEstado(estado);
		
		CidadeDao cidadeDao = new CidadeDao();
		cidadeDao.salvar(cidade);
		
	}
	@Test
	@Ignore
	public void listar() {
		 
		CidadeDao cidadeDao = new CidadeDao();
		List<Cidade> resultado = cidadeDao.listar();
		System.out.println("Total de Registros: "+ resultado.size());
		
		for(Cidade cidade: resultado) {
			System.out.println("Código da Cidade: "+cidade.getCodigo());
			System.out.println("Nome da Cidade: "+cidade.getNome());
			System.out.println("Código do Estado: "+cidade.getEstado().getCodigo());
			System.out.println("Nome do Estado: "+cidade.getEstado().getNome());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 9L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigo);
		
		System.out.println("Código da Cidade: "+cidade.getCodigo());
		System.out.println("Nome da Cidade: "+cidade.getNome());
		System.out.println("Código do Estado:"+cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado: "+cidade.getEstado().getSigla());
		System.out.println("Sigla do Estado: "+cidade.getEstado().getNome());
				
	}
	@Test
	public void excluir() {
		
		Long codigo = 10L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigo);
		cidadeDao.excluir(cidade);
		
	}
	@Test
	public void editar() {
		
		Long codigoEstado =3L;
		Long codigo = 11L;

		EstadoDao estadoDao = new EstadoDao();
		@SuppressWarnings("unused")
		Estado estado = estadoDao.buscar(codigoEstado);
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigo);
		cidade.setNome("Tarumã");
		cidadeDao.editar(cidade);
}
}
