package br.com.stackx.projweb.model;

public class Professor 
{
	protected int idProfessor;
	protected String nome; 
	protected String sexo;
	protected String cpf;
	protected String email;
	protected int ddd;
	protected int telefone;
	protected int idCidade;
	protected String cep;
	protected String logradouro;
	protected String numero;
	protected String complemento;
    

	public Professor()//construtor inicializando variaveis
	{
		this(0, null, null, null, null, 0, 0, 0, null, null, null, null);
	}

	//construtor para receber os parametros
	public Professor(int idProfessor, String nome, String sexo, String cpf, String email, int ddd, int telefone,
			int idCidade, String cep, String logradouro, String numero, String complemento)
	{
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		this.ddd = ddd;
		this.telefone = telefone;
		this.idCidade = idCidade;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	//criação dos métodos Get e Set
	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}	
