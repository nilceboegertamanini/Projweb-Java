package br.com.stackx.projweb.teste;

public class TesteInstancia 
{
	private String nome; //cópia para as instância

	private static String sobrenome; //=> unico para qualquer intância
	
	static //sempre o primeiro a ser executado quando a classo "sobre em memória"
	{
		sobrenome = "Teixeira"; //inicializou o sobrenome
		
		System.out.println("Entrou no construtor estático");
		
		//muito usado para inicializar recursos
	}

	public TesteInstancia() //construtor de instância => executado com o new
	{
		System.out.println("Entrou construtor NAO ESTÁTICO");
		nome = "Cristopher";

		//Inicializa DB AQUI
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}
	
	public static void setSobrenome(String sobrenomeParam)
	{
		sobrenome = sobrenomeParam;
	}

	
	public static String getSobrenome()
	{
		return sobrenome;
	}
}
