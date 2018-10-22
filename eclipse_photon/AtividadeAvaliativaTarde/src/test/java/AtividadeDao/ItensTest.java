package AtividadeDao;

import org.junit.Test;

import Dao.ItensDao;
import Dao.ProdutosDao;
import Dao.VendasDao;
import Domain.Itens;
import Domain.Produtos;
import Domain.Vendas;

public class ItensTest {
	@Test
	public void salvar() {		
		Itens itens = new Itens();
		itens.setQtde(30);
		
		ProdutosDao produtosDao = new ProdutosDao();
		Produtos produtos = produtosDao.buscar(1L);
		itens.setProd(produtos);
		
		VendasDao vendasDao = new VendasDao();
		Vendas venda = vendasDao.buscar(1L);
		itens.setVenda(venda);
		
		itens.setValor_parc((float)(30*produtos.getValor()));
				
		ItensDao itensDao = new ItensDao();
		itensDao.salvar(itens);
			
	}

}
