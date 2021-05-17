package br.com.stackx.projweb.dao;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

import br.com.stackx.projweb.exception.StackXException;


//import br.com.stackx.projweb.exception.StackXException;

public class DAO 
{
	private static BasicDataSource basicDataSource = null;

	//inicializar o banco de dados
	public static void init()
	{
		if(basicDataSource == null)
		{
			basicDataSource = new BasicDataSource();
			basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); //informa ao banco de dados o driver JDBC, MySQL
			basicDataSource.setUsername("root");
			basicDataSource.setPassword("nbtmysql");
			basicDataSource.setUrl("jdbc:mysql://localhost:3306/projweb");

			basicDataSource.setValidationQuery("SELECT CURRENT_TIMESTAMP");
			basicDataSource.setInitialSize(3);
		}
	}

	//recuperar uma conexão
	public static Connection getConnection() throws StackXException
	{
		try
		{
			return basicDataSource.getConnection();
		}
		catch(Exception exception) 
		{
			throw new StackXException("Erro ao obter a conexao", exception);
		}
	}

	//fechar o banco de dados
	public static void close()
	{
		try
		{
			basicDataSource.close();
		}
		catch (Exception e) 
		{
			//nao faz nada
		}
	}
}

//log4j2