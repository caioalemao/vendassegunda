package AtividadeDao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import Dao.FornecedoresDao;
import Dao.ProdutosDao;
import Domain.Fornecedores;
import Domain.Produtos;

public class ProdutosTest {
	
	@Test
	
	public void salvar() {		
		Produtos produtos = new Produtos();
		produtos.setNome("Cerveja");
		produtos.setQtde(750);
		produtos.setValor((float)2.50);
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		Fornecedores fornecedores = fornecedoresDao.buscar(1L);
	    produtos.setFornec(fornecedores);
		
		
		
		ProdutosDao produtosDao = new ProdutosDao();
		produtosDao.salvar(produtos);
		
	}
	@Test
	@Ignore
	public void listar() {
		 
		ProdutosDao produtosDao = new ProdutosDao();
		List<Produtos> resultado = produtosDao.listar();
		System.out.println("Total de Registros: "+ resultado.size());
		
		for(Produtos produtos: resultado) {
			System.out.println("Código do Produto: "+produtos.getCodigo());
			System.out.println("Nome do Produto: "+produtos.getNome());
			System.out.println("Valor do Produto: "+produtos.getValor());
			System.out.println("Quantidade do Produto: "+produtos.getQtde());
			System.out.println("Fornecedor do Produto: "+produtos.getFornec().getNome());
			
		}
	}
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 1L;
		
		ProdutosDao produtosDao = new ProdutosDao();
		Produtos produtos = produtosDao.buscar(codigo);
		
		System.out.println("Código do Produto: "+produtos.getCodigo());
		System.out.println("Nome do Produto: "+produtos.getNome());
		System.out.println("Valor do Produto: "+produtos.getValor());
		System.out.println("Quantidade do Produto: "+produtos.getQtde());
		System.out.println("Fornecedor do Produto: "+produtos.getFornec().getNome());
				
	}
	@Test
	@Ignore

	public void excluir() {
		
		Long codigo = 2L;
		
		ProdutosDao produtosDao = new ProdutosDao();
		Produtos produtos = produtosDao.buscar(codigo);
		produtosDao.excluir(produtos);
		
	}
	@Test
	@Ignore
	public void editar() {
		
		
		Long codigo = 1L;

		ProdutosDao produtosDao = new ProdutosDao();
		Produtos produtos = produtosDao.buscar(codigo);
		produtos.setNome("Coca-Cola");
		produtos.setQtde(600);
		produtos.setValor((float)3.00);
		// buscando a entidade fornecedor
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		Fornecedores fornecedores = fornecedoresDao.buscar(1L);
		produtos.setFornec(fornecedores);
		produtosDao.editar(produtos);
}
}
