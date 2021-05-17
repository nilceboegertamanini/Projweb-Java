package br.com.stackx.projweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.stackx.projweb.exception.StackXException;
import br.com.stackx.projweb.model.Estado;

public class EstadoDAO extends Estado
{
	public void insert() throws StackXException
	{
		try
		{
			Connection minhaConexao = DAO.getConnection(); //peguei a conexão com DB

			//Criei um comando SQL
			PreparedStatement meuSQL =
					minhaConexao.prepareStatement("INSERT INTO Estado (nome, sigla, codigoIbge) VALUES (?, ?, ?) ");
			
			//atribuindo valores aos ? do comando SQL
			meuSQL.setString(1, this.getNome());
			meuSQL.setString(2, this.getSigla());
			meuSQL.setInt(3, this.getCodigoIbge());
			
			//executa o comando SQL criado
			meuSQL.executeUpdate();
			
			meuSQL.close();
//			minhaConexao.commit();
			minhaConexao.close();
		}
		catch(Exception exception)
		{
			throw new StackXException("Erro de inclusão", exception);
		}
	}

	public void update() throws StackXException
	{
		try
		{
			Connection connection = DAO.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Estado SET nome = ?, sigla = ?, codigoIbge = ? WHERE idEstado = ? ");
			
			preparedStatement.setString(1, this.getNome());
			preparedStatement.setString(2, this.getSigla());
			preparedStatement.setInt(3, this.getCodigoIbge());
			preparedStatement.setInt(4, this.getIdEstado());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.close();
		}
		catch(Exception exception)
		{
			throw new StackXException("Erro de update", exception);
		}
	}
	
	public void delete() throws StackXException
	{
		try
		{
			Connection connection = DAO.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(" DELETE FROM Estado WHERE idEstado = ? ");
			
			preparedStatement.setInt(1, this.getIdEstado());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.close();
		}
		catch(Exception exception)
		{
			throw new StackXException("Erro ao realizar o delete", exception);
		}
	}

	public void select() throws StackXException
	{
		try
		{
			Connection connection = DAO.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement(" SELECT nome, sigla, codigoIbge FROM Estado WHERE idEstado = ? ");
			
			preparedStatement.setInt(1, this.getIdEstado());
			
			ResultSet resultSet = preparedStatement.executeQuery(); //recuperar valores idEstado
			
			while(resultSet.next())
			{
				this.setNome(resultSet.getString(1));
				this.setSigla(resultSet.getString(2));
				this.setCodigoIbge(resultSet.getInt(3));
			}
			
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}
		catch(Exception exception)
		{
			throw new StackXException("Erro ao realizar o select", exception);
		}
	}

	public List<Estado> selectAll() throws StackXException
	{
		return selectAll(null);
	}

	public List<Estado> selectAll(String nomeEstadoPesquisa) throws StackXException
	{
		try
		{
			Connection connection = DAO.getConnection();

			StringBuilder stringQuery = new StringBuilder("SELECT idEstado, nome, sigla, codigoIbge FROM Estado");
			
			if(nomeEstadoPesquisa != null)
			{
				stringQuery.append(" WHERE nome LIKE ? ");
			}
			
			stringQuery.append(" ORDER BY nome");
			
			PreparedStatement preparedStatement = connection.prepareStatement(stringQuery.toString());
			
			if(nomeEstadoPesquisa != null)
			{
				preparedStatement.setString(1, "%" + nomeEstadoPesquisa + "%");
			}
			
			ResultSet resultSet = preparedStatement.executeQuery(); //recuperar valores idEstado
			
			ArrayList<Estado> arrayListRetorno = new ArrayList<Estado>();

			while(resultSet.next())
			{
				Estado estado = new Estado();
				estado.setIdEstado(resultSet.getInt(1));
				estado.setNome(resultSet.getString(2));
				estado.setSigla(resultSet.getString(3));
				estado.setCodigoIbge(resultSet.getInt(4));
				
				arrayListRetorno.add(estado);
			}
			
			resultSet.close();
			preparedStatement.close();
			connection.close();
			
			return arrayListRetorno;
		}
		catch(Exception exception)
		{
			throw new StackXException("Erro ao selecionar todos os estados", exception);
		}
	}
}
