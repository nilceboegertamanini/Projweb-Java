package br.com.stackx.projweb.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quadrado extends FiguraGeometrica
{
	private double lado;

	public Quadrado()
	{
		
	}
	
	public Quadrado(double lado)
	{
		this.lado = lado;
	}
	
	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado) 
	{
		this.lado = lado;
	}
	
	public double getArea()
	{
		return lado * lado;
	}
	
	public double getPerimetro()
	{
		return 4 * lado;
	}
	
	public Map getLista()
	{
		HashMap meuArray = new HashMap();
		

		return meuArray;
	}
}
