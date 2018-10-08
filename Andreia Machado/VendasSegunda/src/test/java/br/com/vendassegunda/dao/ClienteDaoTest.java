package br.com.vendassegunda.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


import br.com.vendassegunda.domain.Cliente;
import br.com.vendassegunda.domain.Pessoa;


@SuppressWarnings("unused")
public class ClienteDaoTest {
	@Test
	public void salvar() throws ParseException {
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = pessoaDao.buscar(1L);
		
		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		//cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2018"));
		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);
		
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.salvar(cliente);
		
		System.out.println("Cliente Salvo com Sucesso");
		
		
		
	}

}
