package br.com.vendassegunda.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.omnifaces.util.Messages;

import br.com.vendassegunda.dao.EstadoDao;
import br.com.vendassegunda.domain.Estado;

@ManagedBean
@ViewScoped
public class EstadoBean {

	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void novo() {
		estado = new Estado();
	}

	public void salvar() {
		try {

			EstadoDao estadoDao = new EstadoDao();

			estadoDao.merge(estado);
			Messages.addGlobalInfo("Estado salvo com sucesso");

		} catch (Exception e) {
			Messages.addGlobalError("Falha ao salvar ");
			e.fillInStackTrace();

		}

	}

	@PostConstruct
	public void listar() {
		try {
			EstadoDao estadoDao = new EstadoDao();
			estadoDao.listar(); 
		} catch (Exception e) {
			Messages.addGlobalError("Falha ao Listar");

		}
	}

}
