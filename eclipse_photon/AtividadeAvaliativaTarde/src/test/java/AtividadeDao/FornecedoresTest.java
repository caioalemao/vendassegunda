package AtividadeDao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import Dao.FornecedoresDao;
import Domain.Fornecedores;



public class FornecedoresTest {
	
	@Test
	
	public void salvar() {		
		Fornecedores fornecedores = new Fornecedores();
		fornecedores.setNome("Ambev");
		
		
		FornecedoresDao fornercedor = new FornecedoresDao();
		fornercedor.salvar(fornecedores);
		
	}
	@Test
	@Ignore
	public void listar() {
		 
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		List<Fornecedores> resultado = fornecedoresDao.listar();
		System.out.println("Total de Registros: "+ resultado.size());
		
		for(Fornecedores fornecedor: resultado) {
			System.out.println("Código do Fornecedor: "+fornecedor.getCodigo());
			System.out.println("Nome do Fornecedor: "+fornecedor.getNome());
			
		}
	}
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 1L;
		
		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		Fornecedores fornecedor = fornecedoresDao.buscar(codigo);
		
		System.out.println("Código do Fornecedor: "+fornecedor.getCodigo());
		System.out.println("Nome do Fornecedor: "+fornecedor.getNome());
				
	}
	@Test
	@Ignore

	public void excluir() {
		
		Long codigo = 2L;
		
		FornecedoresDao fornecedorDao = new FornecedoresDao();
		Fornecedores fornecedor = fornecedorDao.buscar(codigo);
		fornecedorDao.excluir(fornecedor);
		
	}
	@Test
	@Ignore
	public void editar() {
		
		
		Long codigo = 1L;

		FornecedoresDao fornecedoresDao = new FornecedoresDao();
		Fornecedores fornecedor = fornecedoresDao.buscar(codigo);
		fornecedor.setNome("Ambev");
		fornecedoresDao.editar(fornecedor);
}
}
