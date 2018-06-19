package br.com.gabriel.springRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gabriel.springRest.model.User;
import br.com.gabriel.springRest.service.UserService;

@Controller
@RequestMapping( path = "/user" )
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping( path = "/add" )
    public String saveUser ( @ModelAttribute User user, Model model ) {

	service.save( user );
	model.addAttribute( "message", "Usuário salvo com sucesso" );
	return "success";
    }

    @GetMapping( path = "/new" )
    public String addNewUser ( Model model ) {

	model.addAttribute( "user", new User( ) );
	return "new-user";
    }

    @GetMapping( path = "/all" )
    public String getAllUsers ( Model model ) {

	model.addAttribute( "usuarios", service.findAll( ) );
	return "all-user";
    }
}
