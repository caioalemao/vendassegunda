package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Itens extends GenericDomain{
	@Column(nullable = false)
	private int qtde;
	@Column(nullable = false)
	private float valor_parc;
	@JoinColumn(nullable = false)
	@ManyToOne
	private Produtos prod;
	@JoinColumn(nullable = false)
	@ManyToOne
	private Vendas venda;
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public float getValor_parc() {
		return valor_parc;
	}
	public void setValor_parc(float valor_parc) {
		this.valor_parc = valor_parc;
	}
	public Produtos getProd() {
		return prod;
	}
	public void setProd(Produtos prod) {
		this.prod = prod;
	}
	public Vendas getVenda() {
		return venda;
	}
	public void setVenda(Vendas venda) {
		this.venda = venda;
	}
	
	

}
