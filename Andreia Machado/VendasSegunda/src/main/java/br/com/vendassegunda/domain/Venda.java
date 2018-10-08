package br.com.vendassegunda.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Venda extends GenericDomain {
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario;
	
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorTota;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	private Funcionario fucionario;

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public BigDecimal getValorTota() {
		return valorTota;
	}

	public void setValorTota(BigDecimal valorTota) {
		this.valorTota = valorTota;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFucionario() {
		return fucionario;
	}

	public void setFucionario(Funcionario fucionario) {
		this.fucionario = fucionario;
	}
	
	
	
	

}
