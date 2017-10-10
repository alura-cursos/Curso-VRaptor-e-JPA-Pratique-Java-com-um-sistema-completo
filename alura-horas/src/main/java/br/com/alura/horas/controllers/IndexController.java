package br.com.alura.horas.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Controller
public class IndexController {
    @Path("/")
    public void index(){}
}