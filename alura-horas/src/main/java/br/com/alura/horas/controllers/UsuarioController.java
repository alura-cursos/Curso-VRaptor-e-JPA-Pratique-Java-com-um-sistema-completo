package br.com.alura.horas.controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.alura.horas.dao.UsuarioDao;
import br.com.alura.horas.modelos.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class UsuarioController {
	private UsuarioDao usuarioDao;
	private Result result;
	private Validator validator;
	@Inject
	public UsuarioController(UsuarioDao usuarioDao,Result result,Validator validator){
    	this.usuarioDao = usuarioDao;
    	this.result = result;
    	this.validator = validator;
    }

	public UsuarioController(){}
	
    
    @IncludeParameters
    public void adiciona(@Valid Usuario usuario){
    	validator.onErrorForwardTo(this).form();
    	usuarioDao.adiciona(usuario);
    	result.redirectTo(this).lista();
    }

    public void form(){}

    public void lista(){
        result.include("usuarios", usuarioDao.lista());
    }
}