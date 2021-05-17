package br.com.stackx.projweb.servlet;

import java.io.IOException;

//Tomcat 8.5 e 9

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Tomcat 10
/*
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
*/

import br.com.stackx.projweb.dao.DAO;
import br.com.stackx.projweb.dao.EstadoDAO;
import br.com.stackx.projweb.exception.StackXException;

/**
 * Servlet implementation class GravaEstado
 */
@WebServlet("/GravaEstado") 

public class GravaEstado extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GravaEstado() 
    {
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Executando o método init do servlet GravaEstado");
		
		//inicializar o DB
		DAO.init();
		System.out.println("DB inicializado com sucesso");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		System.out.println("Executando o método destroy do servlet GravaEstado");
		
		//finalizar o DB
		DAO.close();
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println("Executando o método doGet do servlet GravaEstado");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			System.out.println("Executando o método doPost do servlet GravaEstado");
			
			String nome = request.getParameter("nome");
			String sigla = request.getParameter("sigla");
			String codigoIbge = request.getParameter("codigoIbge");
			
			System.out.println("Nome: " + nome);
			System.out.println("Sigla: " + sigla);
			System.out.println("Codigo Ibge: " + codigoIbge);
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.setNome(nome);
			estadoDAO.setSigla(sigla);
			estadoDAO.setCodigoIbge(Integer.parseInt(codigoIbge));
			estadoDAO.insert();
			
			response.sendRedirect("/projweb/ConfirmacaoCadastroEstado.jsp");
			
			//MVC = Model (DAO)  /  View (JSP)  /  Controller(SERVLET)
		} 
		catch(StackXException stackXException) 
		{
			stackXException.getException().printStackTrace();
		}
	}
}
