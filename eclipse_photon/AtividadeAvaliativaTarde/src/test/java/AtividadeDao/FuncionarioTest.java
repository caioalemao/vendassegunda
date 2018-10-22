package AtividadeDao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import Dao.FuncionarioDao;
import Domain.Funcionario;



public class FuncionarioTest {
	
	@Test
	
	public void salvar() {		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Caio");
		funcionario.setCpf("45291623896");
		funcionario.setFuncao("Developer");
		funcionario.setSenha("1234");
					
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.salvar(funcionario);
		
	}
	@Test
	@Ignore
	public void listar() {
		 
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		List<Funcionario> resultado = funcionarioDao.listar();
		System.out.println("Total de Registros: "+ resultado.size());
		
		for(Funcionario funcionario: resultado) {
			System.out.println("Código: "+funcionario.getCodigo());
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println("CPF: "+funcionario.getCpf());
			System.out.println("Funcao: "+funcionario.getFuncao());
		}
	}
	@Test
	@Ignore
	public void buscar() {
		
		Long codigo = 1L;
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);
		
		System.out.println("Código: "+funcionario.getCodigo());
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("CPF: "+funcionario.getCpf());
		System.out.println("Funcao: "+funcionario.getFuncao());
				
	}
	@Test
	@Ignore

	public void excluir() {
		
		Long codigo = 2L;
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);
		funcionarioDao.excluir(funcionario);
		
	}
	@Test
	@Ignore
	public void editar() {
		
		
		Long codigo = 1L;

		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);
		funcionario.setNome("Andre");
		funcionario.setCpf("12345678912");
		funcionario.setFuncao("Analista");
		funcionario.setSenha("4321");
		funcionarioDao.editar(funcionario);
}
}
