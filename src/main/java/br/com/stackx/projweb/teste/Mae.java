package br.com.stackx.projweb.teste;

import org.apache.commons.lang3.StringUtils;

public class Mae 
{
	protected String nomeMae;
	int idadeMae;

	//private / protected / default / public
	
	public Mae() //padrao / default
	{
		this(null);
	}

	public Mae(String nomeMaeParam) //<==contrutor mais completo da classe
	{
		this.nomeMae = StringUtils.trimToEmpty(nomeMaeParam);
	}
	
	public void setNomeMae(String nomeMaeParam)
	{
		this.nomeMae = nomeMaeParam;
	}
	
	public String getNomeMae()
	{
		return this.nomeMae;
	}
}

