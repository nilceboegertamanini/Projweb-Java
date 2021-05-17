package br.com.stackx.projweb.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import br.com.stackx.projweb.model.Estado;

public class Teste 
{

	public static void main(String[] args) 
	{
		Mae minhaMae = new Mae();
		
/*
		Filho meuFilho1 = new Filho();
		meuFilho1.setNomeFilho("André");
		meuFilho1.setIdadeFilho(19);
		meuFilho1.setNomeMae("Helena");
		
		System.out.println("meuFilho1.getNomeFilho()" + meuFilho1.getNomeFilho());
		System.out.println("meuFilho1.getIdadeFilho(): " + meuFilho1.getIdadeFilho());
		System.out.println("meuFilho1.getNomeMae(): " + meuFilho1.getNomeMae());

		Filho meuFilho2 = new Filho("André", 19);
		meuFilho2.setNomeMae("Helena");
		
		System.out.println("meuFilho2.getNomeFilho()" + meuFilho2.getNomeFilho());
		System.out.println("meuFilho2.getIdadeFilho(): " + meuFilho2.getIdadeFilho());
		System.out.println("meuFilho2.getNomeMae(): " + meuFilho2.getNomeMae());
*/
		
		String nomeEstadoPesquisa = "rio";
		
		int i = 0;
		
		String str = "";
		
		long t1 = System.currentTimeMillis();
		
		
		while(i < 1000000)
		{
			str += "a";
			i++;
		}
		
		t1 = System.currentTimeMillis();
		i = 0;
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println("Tempo inicio: " + System.currentTimeMillis());
		
		while(i < 1000000)
		{
			stringBuilder.append("a");
			i++;
		}
		
		System.out.println("Tempo: " + (System.currentTimeMillis() - t1));
		
	}
}