package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends GenericDomain{
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 11, nullable = false, unique = true)
	private String cpf;
	@Column(length = 20, nullable = false)
    private String senha;
	@Column(length = 20, nullable = false)
    private String funcao;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
    

}
