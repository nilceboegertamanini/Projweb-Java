package br.com.stackx.projweb.teste;

import java.util.List;

import br.com.stackx.projweb.dao.DAO;
import br.com.stackx.projweb.dao.EstadoDAO;
import br.com.stackx.projweb.model.Estado;

public class EstadoDAOTeste {

	public static void main(String[] args) 
	{
		try
		{
			//inicializar o DB
			DAO.init();
			
			EstadoDAO estadoDAO = new EstadoDAO();

			List<Estado> minhaLista = estadoDAO.selectAll();
			
			for(int i = 0; i < minhaLista.size(); i++)
			{
				System.out.println(minhaLista.get(i).getIdEstado());
				System.out.println(minhaLista.get(i).getNome());
				System.out.println(minhaLista.get(i).getSigla());
				System.out.println(minhaLista.get(i).getCodigoIbge());
				System.out.println("---");
			}
		
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}

	}

}
