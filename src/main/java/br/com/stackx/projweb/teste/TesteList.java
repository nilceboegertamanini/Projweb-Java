package br.com.stackx.projweb.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.stackx.projweb.model.Estado;

public class TesteList 
{
	public static void main(String[] args)
	{
		List<Estado> minhaLista = new ArrayList<Estado>();
		
		
		
		minhaLista.add(new Estado(0, "Parana", "PR", 41)); //0
		minhaLista.add(new Estado(0, "Amazonas", "AM", 91)); //1
		minhaLista.add(new Estado(0, "Sao Paulo", "SP", 11)); //2
		
		for(int i = 0; i < minhaLista.size(); i++)
		{
			System.out.println("idEstado: " + minhaLista.get(i).getIdEstado());
			System.out.println("nome: " + minhaLista.get(i).getNome());
			System.out.println("sigla: " + minhaLista.get(i).getSigla());
			System.out.println("codigoIbge: " + minhaLista.get(i).getCodigoIbge());
			System.out.println("");
		}
		
		minhaLista.remove(1);

		System.out.println("--------");
		for(int i = 0; i < minhaLista.size(); i++)
		{
			System.out.println("idEstado: " + minhaLista.get(i).getIdEstado());
			System.out.println("nome: " + minhaLista.get(i).getNome());
			System.out.println("sigla: " + minhaLista.get(i).getSigla());
			System.out.println("codigoIbge: " + minhaLista.get(i).getCodigoIbge());
			System.out.println("");
		}
		
		
	}
}
