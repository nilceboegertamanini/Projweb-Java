package br.com.stackx.projweb.teste;

public class Circulo extends FiguraGeometrica
{
	private double raio;
	
	public Circulo()
	{
		
	}
	
	public Circulo (double raio)
	{
		this.raio = raio;
	}
	
	public double getRaio() 
	{
		return raio;
	}

	public void setRaio(double raio) 
	{
		this.raio = raio;
	}

	public double getArea()
	{
		return Math.pow((3.14 * raio), 2);
	}
	
	public double getPerimetro()
	{
		return 2 * 3.14 * raio;
	}
}
