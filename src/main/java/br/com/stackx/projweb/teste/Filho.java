package br.com.stackx.projweb.teste;

public class Filho extends Mae
{
	private String nomeFilho;
	private int idadeFilho;

	public Filho() //padrao / default
	{
		//this.nomeFilho = null;
		//this.idadeFilho = 0;
		
		this(null, 0);
	}
	
	public Filho(String nomeFilhoParam, int idadeFilhoParam) //<=concentra a logica no contrustor mais complexo
	{
		this.nomeFilho = nomeFilhoParam;
		this.idadeFilho = idadeFilhoParam;
		
//		this.setNomeFilho(nomeFilhoParam);
//		this.setIdadeFilho(idadeFilhoParam);
	}
	
	public Filho(String nomeFilhoParam, int idadeFilhoParam, String nomeMaeParam) //<=concentra a logica no contrustor mais complexo
	{
		super(nomeMaeParam);

		super.nomeMae = nomeMaeParam;
		this.nomeFilho = nomeFilhoParam;
		this.idadeFilho = idadeFilhoParam;
	}
	
	public void setNomeFilho(String nomeFilhoParam)
	{
		this.nomeFilho = nomeFilhoParam;
	}
	
	public String getNomeFilho()
	{
		return this.nomeFilho;
	}

	public int getIdadeFilho() 
	{
		return idadeFilho;
	}

	public void setIdadeFilho(int idadeFilho) 
	{
		this.idadeFilho = idadeFilho;
	}
	
	
}
