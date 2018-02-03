package br.com.unitri.desenvolvimentoweb.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import br.com.unitri.desenvolvimentoweb.exceptions.PosJavaUnitriException;

@ControllerAdvice
public class ExceptionsHandler {
	
	@ExceptionHandler(PosJavaUnitriException.class)
	public ModelAndView handleLivroNaoEncontradoException
							(PosJavaUnitriException e, HttpServletRequest request) {
		
		DetalhesErro detalhe = new DetalhesErro();
		detalhe.setStatus(404l);
		detalhe.setTitulo("Erro ao acessar página.");
		detalhe.setTimestamp(System.currentTimeMillis());
		
		ModelAndView modelView = new ModelAndView("erro");
		modelView.addObject("detalhe", detalhe);
		
		return modelView;
	}

}
