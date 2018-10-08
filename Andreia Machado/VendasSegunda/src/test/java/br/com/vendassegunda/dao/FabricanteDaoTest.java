package br.com.vendassegunda.dao;

import org.junit.Test;

import br.com.vendassegunda.dao.FabricanteDao;
import br.com.vendassegunda.domain.Fabricante;

public class FabricanteDaoTest {
	@Test
	public void Salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setNome("XYZ Enterprise");
		
		FabricanteDao fabricantedao = new FabricanteDao();
		fabricantedao.salvar(fabricante);
		
	}

}
