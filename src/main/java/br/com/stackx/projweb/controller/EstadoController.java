package br.com.stackx.projweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.stackx.projweb.dao.DAO;
import br.com.stackx.projweb.dao.EstadoDAO;
import br.com.stackx.projweb.exception.StackXException;
import br.com.stackx.projweb.model.Estado;

@Controller // informa ao spring que é uma classe de controller
public class EstadoController 
{
	@RequestMapping(value = "/CadastroEstado", method = RequestMethod.GET) //como será chamado pelo navegador e o método
	public ModelAndView cadastroEstado(@ModelAttribute("SpringWeb") Estado estado, 
			                           ModelMap model) throws StackXException
	{
		/*if(0 == 0)
		{
			int i = 0;
			//i = i/i;
			throw new StackXException("Teste de erro", null);
		}*/
		
		if(estado.getIdEstado() != 0)
		{
			System.out.println("recuperando o estado");
			
			DAO.init();
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.setIdEstado(estado.getIdEstado());
			estadoDAO.select(); //busca um determinado estado no DB
			
			estado = estadoDAO;
		}
		
		//retorno ModelAndView normalmente são usados quando o JPS de retorno tem um formulário
		return new ModelAndView("cadastroEstado", "command", estado); //nome do JSP, command, classe model 
	}

	@RequestMapping(value = "/addEstado", method = RequestMethod.POST) //invocado no submit do form
	public String addEstado(@Valid @ModelAttribute("command") Estado estado,
						    BindingResult result,
						    ModelMap model, 
						    HttpServletRequest request) throws StackXException
	{
		if(result.hasErrors() || result.hasFieldErrors())
		{
			System.out.println("### Tem erro de validacao ###");
			return "cadastroEstado";
			//return cadastroEstado(estado, model);
		}

		//inserir do DB
		DAO.init();

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.setNome(estado.getNome());
		estadoDAO.setSigla(estado.getSigla());
		estadoDAO.setCodigoIbge(estado.getCodigoIbge());
	
		if(estado.getIdEstado() == 0)
		{
			System.out.println("fazendo o insert");
			estadoDAO.insert();
		}
		else
		{
			System.out.println("fazendo o update");
			estadoDAO.setIdEstado(estado.getIdEstado());
			estadoDAO.update();
		}
		
		//return "exibeEstado"; //retorna pagina JSP cujo nome é exibe estado
		
		//return new ModelAndView("exibeEstado", "command", estado); //nome do JSP, command, classe model
		
		return "redirect:ListaEstado"; //invoca a página no navegador
		//return listaEstado(model);

	}

	//lista
	@RequestMapping(value = "/ListaEstado", method = {RequestMethod.GET, RequestMethod.POST})
	public String listaEstado(@RequestParam(required = false) String nomeEstadoPesquisa, ModelMap model) throws StackXException
	{
		DAO.init();

		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> listEstados = estadoDAO.selectAll(nomeEstadoPesquisa);

		model.addAttribute("nomeEstadoPesquisa", nomeEstadoPesquisa); //--> retorna o parametro para página
		
		model.addAttribute("estados", listEstados); //envia uma lista de estados para o JSP

		//return new ModelAndView("listaEstado", "command", estado);
		return "listaEstado"; //retorno para JSP
	}

	//exclusão
	@RequestMapping(value="/RemoveEstado", method = RequestMethod.POST)
	public String removeEstado(@RequestParam(required = true) int idEstado) throws StackXException
	{
		DAO.init();
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.setIdEstado(idEstado);
		estadoDAO.delete();
		
		return "redirect:ListaEstado"; 
	}
}
