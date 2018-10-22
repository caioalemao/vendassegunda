package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Produtos extends GenericDomain{
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(nullable = false)
	private float valor;
	@Column(nullable = false)
	private int qtde;
	@JoinColumn(nullable = false)
	@ManyToOne
	private Fornecedores fornec;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Fornecedores getFornec() {
		return fornec;
	}
	public void setFornec(Fornecedores fornec) {
		this.fornec = fornec;
	}

}
