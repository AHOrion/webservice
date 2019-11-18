package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import model.Cliente;
@Controller
public class LoginAction {

	@Autowired
	RestTemplate template;
	String url ="http://localhost:8080/11_servicio_login/login";
	
	@PostMapping(value="/doLogin")
	public String login(@RequestParam("user") String usuario
			            ,@RequestParam("pwd") String password
			                 ) { 		
		Cliente cliente = template.getForObject(url+"/"+usuario+"/"+password, Cliente.class);
		return cliente != null? "entrada":"login";
       
	}
	
	
}
