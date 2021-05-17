package br.com.stackx.projweb.teste;

import java.io.File;
import java.io.FileInputStream;

public class TesteException {

	public static void main(String[] args) 
	{
		try
		{
			carregaArquivo();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void carregaArquivo() throws Exception
	{
		try
		{
			File file = new File("d:\\teste1.txt");
			FileInputStream fis = new FileInputStream(file);
			System.out.println(fis.available());
			fis.close();
		}
		catch(Exception ex)
		{
			throw new Exception("erro ao carregar o arquivo", ex);
		}
	}
}
