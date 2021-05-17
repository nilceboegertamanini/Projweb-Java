package br.com.stackx.projweb.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import br.com.stackx.projweb.dao.DAO;

//Tomcat 8.5 e 9.0
/*
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

//Tomcat 10
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiraServlet
 */
@WebServlet("/PrimeiraServlet") //anotação para o Tomcat saber que a Classe "/PrimeiraServlet" está sendo chamada
public class PrimeiraServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    /** 
     * Default constructor. 
     */
    public PrimeiraServlet() 
    {
         
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter(); //gerando uma saída para escrever html
		
		out.println("<html>");
		
		out.println("<body");
		
		out.println("<h1>Minha Primeira Servlet! (Nilce)</h1>");
		
		out.println("<h2>Minha Segunda Linha da Servlet! (Nilce)</h2>");
				
		out.println("</body");
		
		out.println("</html");
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//redirecionado para o método doGet
		doGet(request, response);
	}
 
}  
