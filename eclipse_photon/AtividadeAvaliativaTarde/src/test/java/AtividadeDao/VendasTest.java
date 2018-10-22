package AtividadeDao;






import org.junit.Test;

import Dao.FuncionarioDao;

import Dao.VendasDao;
import Domain.Funcionario;



public class VendasTest {
	@Test

	public void salvar() {						
		Domain.Vendas vendas = new Domain.Vendas();
		vendas.setHora(new java.util.Date());
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(1L);
		vendas.setFun(funcionario);
		
		
		vendas.setTotal((float)100);
		
		VendasDao vendasDao = new VendasDao();
		vendasDao.salvar(vendas);
	}

}
