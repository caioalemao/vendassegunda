package Domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Vendas extends GenericDomain {
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date hora;
	@Column(nullable = false)
	private float total;
	@JoinColumn(nullable = false)
	@ManyToOne
	private Funcionario fun;
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Funcionario getFun() {
		return fun;
	}
	public void setFun(Funcionario fun) {
		this.fun = fun;
	}
	

}
