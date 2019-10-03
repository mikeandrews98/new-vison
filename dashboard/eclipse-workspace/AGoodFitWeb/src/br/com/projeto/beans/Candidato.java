package br.com.projeto.beans;

public class Candidato extends Usuario{


	private int codCandidato;
	private String nome;
	private String cpf;
	private String rg;
	private String dataNasc;
	private String descricao;
	private Usuario usuario;
	
	public Candidato() {
		super();
	}
	
	public Candidato(int codUsuario, String login, String senha, String email, NivelUsuario nivel, Endereco endereco,
			int codCandidato, String nome, String cpf, String rg, String dataNasc, String descricao, Usuario usuario) {
		super(codUsuario, login, senha, email, nivel, endereco);
		this.codCandidato = codCandidato;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.descricao = descricao;
		this.usuario = usuario;
	}

	public int getCodCandidato() {
		return codCandidato;
	}
	public void setCodCandidato(int codCandidato) {
		this.codCandidato = codCandidato;
	}
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}