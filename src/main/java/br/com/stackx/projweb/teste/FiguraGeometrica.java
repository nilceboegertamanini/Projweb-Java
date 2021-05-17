package br.com.stackx.projweb.teste;

public abstract class FiguraGeometrica implements IFiguraGeometrica
{
	private String cor;
	
	
	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}
}
