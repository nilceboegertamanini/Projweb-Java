package br.com.stackx.projweb.model;

public class Cidade 
{
	protected int idCidade;
	protected String nome;	
	protected int codigoIbge;
	protected int idEstado;
	
	public Cidade()//construtor inicializando variaveis
	{
		this(0,null,0,0);
	}
	
		
	public Cidade(int idCidade, String nome, int codigoIbge, int idEstado)//construtor para receber os parametros
	{
		super();
		this.idCidade = idCidade;
		this.nome = nome;
		this.codigoIbge = codigoIbge;
		this.idEstado = idEstado;
	}
	
	//criação dos métodos Get e Set
	public int getIdCidade() 
	{
		return idCidade;
	}
	public void setIdCidade(int idCidade) 
	{
		this.idCidade = idCidade;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getCodigoIbge() 
	{
		return codigoIbge;
	}
	public void setCodigoIbge(int codigoIbge) 
	{
		this.codigoIbge = codigoIbge;
	}
	public int getIdEstado() 
	{
		return idEstado;
	}
	public void setIdEstado(int idEstado) 
	{
		this.idEstado = idEstado;
	}
}
