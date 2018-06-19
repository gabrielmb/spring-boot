package br.com.gabriel.springRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gabriel.springRest.model.User;

@Controller
public class HelloController {

    @GetMapping( path = {"/home","/"} )
    public String pageStatic (Model model ) {
	model.addAttribute( "user", new User() );
	return "new-user";
    }
    
}
