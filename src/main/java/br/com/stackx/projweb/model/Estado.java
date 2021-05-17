package br.com.stackx.projweb.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;

public class Estado implements Serializable
{
	protected int idEstado;

	@NotBlank(message = "Nome é obrigatório")
	@Size(min = 1, max = 80, message = "O nome deve ter entre 1 e 80 caracteres")
	protected String nome;
	
	@NotBlank(message = "Sigla é obrigatória")
	@Size(min = 2, max = 2, message = "A sigla do estado deve ter 2 caracteres")
	protected String sigla;
	
	@NotNull(message = "Código IBGE é obrigatório")
	@Min(value = 11, message = "O código IBGE deve ser igual ou maior que 11")
	@Max(value = 53, message = "O código IBGE deve ser igual ou menor que 53")
	protected Integer codigoIbge; //int, float, double, char => Integer, Float, Double, Character
	
	public Estado()
	{
		this(0, null, null, 0);
	}
	
	public Estado(int idEstado, String nome, String sigla, Integer codigoIbge) 
	{
		this.idEstado = idEstado;
		this.nome = nome;
		this.sigla = sigla;
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
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = StringUtils.trimToNull(nome);
	}
	
	public String getSigla() 
	{
		return sigla;
	}
	
	public void setSigla(String sigla) 
	{
		this.sigla = StringUtils.trimToNull(sigla);
	}
	
	public Integer getCodigoIbge() 
	{
		return codigoIbge;
	}
	
	
	public void setCodigoIbge(Integer codigoIbge) 
	{
		this.codigoIbge = codigoIbge;
	}
	
	
}
