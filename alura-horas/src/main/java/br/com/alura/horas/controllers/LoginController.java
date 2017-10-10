package br.com.alura.horas.controllers;

import javax.inject.Inject;

import br.com.alura.horas.dao.UsuarioDao;
import br.com.alura.horas.modelos.Usuario;
import br.com.alura.horas.seguranca.Open;
import br.com.alura.horas.seguranca.UsuarioLogado;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class LoginController {
	private UsuarioDao usuarioDao;
	private UsuarioLogado usuarioLogado;
	private Result result;
	private Validator validator;
	
	@Inject
	public LoginController(UsuarioDao usuarioDao, UsuarioLogado usuarioLogado,Result result,Validator validator){
		this.usuarioDao = usuarioDao;
		this.usuarioLogado = usuarioLogado;
		this.result = result;
		this.validator = validator;
	}
	public LoginController(){}
	
	@Open
    public void form(){
    	
    }
    
	@Open
    public void autentica(String login, String senha){
    	Usuario usuario = usuarioDao.busca(login,senha);
    	if(usuario != null){
    		usuarioLogado.fazLogin(usuario);
    		result.redirectTo(UsuarioController.class).lista();
    	} else {
    		validator.add(new SimpleMessage("Login_invalido","Login ou senha incorretos"));
    		validator.onErrorRedirectTo(this).form();
    	}
    }
    
	@Open
    public void desloga(){
    	this.usuarioLogado.desloga();
    	result.redirectTo(this).form();
    }
}