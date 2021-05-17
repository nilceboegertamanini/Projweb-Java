package br.com.stackx.projweb.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class StackXLogger 
{
	private static Logger logger = null;

	static
	{
		Configurator.initialize("projweb", "C:\\Nilce\\projweb\\src\\main\\webapp\\WEB-INF\\log4j2.xml");
		logger = LogManager.getLogger();
		
		System.out.println("Logger Inicializado");
	}

	public static void setMensagemError(String mensagem)
	{
		logger.error(mensagem);
	}

	public static void setMensagemAlerta(String mensagem)
	{
		logger.warn(mensagem);
	}

	public static void setMensagemInfo(String mensagem)
	{
		logger.info(mensagem);
	}
}
