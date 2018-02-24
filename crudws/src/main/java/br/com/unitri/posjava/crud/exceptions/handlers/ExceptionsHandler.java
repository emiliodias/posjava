package br.com.unitri.posjava.crud.exceptions.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import br.com.unitri.posjava.crud.exceptions.CampoObrigatorioException;

@ControllerAdvice
public class ExceptionsHandler {
	
	@ExceptionHandler(CampoObrigatorioException.class)
	public ModelAndView handleCampoObrigatorioException
							(CampoObrigatorioException e, HttpServletRequest request) {
		
		DetalhesErro detalhe = new DetalhesErro();
		detalhe.setStatus(400l);
		detalhe.setTitulo(e.getMessage());
		detalhe.setTimestamp(System.currentTimeMillis());
		
		ModelAndView modelView = new ModelAndView("forward:/alunos");
		modelView.addObject("erro", detalhe);
		
		return modelView;
		
	}

}
