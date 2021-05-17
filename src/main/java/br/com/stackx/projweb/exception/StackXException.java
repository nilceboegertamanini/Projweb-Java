package br.com.stackx.projweb.exception;

import br.com.stackx.projweb.logger.StackXLogger;

public class StackXException extends Exception
{
	private String mensagem;
	private Exception exception;

	public StackXException()
	{
		this(null, null);
	}

	public StackXException(String mensagem, 
			               Exception exception) 
	{
		super(mensagem, exception);
		
		this.mensagem = mensagem;
		this.exception = exception;

		//gravar o erro em disco
		StackXLogger.setMensagemError(this.getMessage());
		
		if(this.getCause() != null)
		{
			StackXLogger.setMensagemError(this.getCause().toString());
		}

		//mandando um e-mail para o responsável
		System.out.println("Passando pelo construtor da StackXException");
	}

	public String getMensagem() 
	{
		return mensagem;
	}

	public void setMensagem(String mensagem) 
	{
		this.mensagem = mensagem;
	}

	public Throwable getException() 
	{
		return exception;
	}

	public void setException(Exception exception) 
	{
		this.exception = exception;
	}
}