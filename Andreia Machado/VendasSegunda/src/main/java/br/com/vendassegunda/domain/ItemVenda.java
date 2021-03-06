package br.com.vendassegunda.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ItemVenda extends GenericDomain{
	
	@Column(nullable = false)
	private Short qtde;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal valorParcial;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Produto produto;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Funcionario funcionario;

	public Short getQtde() {
		return qtde;
	}

	public void setQtde(Short qtde) {
		this.qtde = qtde;
	}

	public BigDecimal getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(BigDecimal valorParcial) {
		this.valorParcial = valorParcial;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	

}
