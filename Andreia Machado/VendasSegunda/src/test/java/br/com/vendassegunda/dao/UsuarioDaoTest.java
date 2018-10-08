package br.com.vendassegunda.dao;

import org.junit.Test;

import br.com.vendassegunda.domain.Pessoa;
import br.com.vendassegunda.domain.Usuario;

public class UsuarioDaoTest {
	
	@Test
	public void Salvar() {
		
		 PessoaDao pessoaDao = new PessoaDao();
		 Pessoa pessoa = pessoaDao.buscar(1L);
		
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('A');
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.salvar(usuario);
		
		System.out.println("usuario Salvo com sucesso.");
		
		
	}

}
