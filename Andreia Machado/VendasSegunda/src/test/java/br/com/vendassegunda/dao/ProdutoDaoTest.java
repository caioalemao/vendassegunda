package br.com.vendassegunda.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.vendassegunda.domain.Fabricante;
import br.com.vendassegunda.domain.Produto;

public class ProdutoDaoTest {
	@Test
	public void salvar() {
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(1L);
		
		Produto produto = new Produto();
		produto.setDescricao("trufa 100mg");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("2.50"));
		produto.setQtde(new Short("7"));
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvar(produto);
		
		System.out.println("Produto Salvo com Sucesso");
		
		
	}

}
