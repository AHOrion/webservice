package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import model.Contacto;

@Controller
public class AltaContactoAction {

	@Autowired
	RestTemplate template;
	String url ="http://localhost:8080/07_crud_contactos_rest/contacto";
	
	@GetMapping(value="/toAlta")
	public String inicio(Model model) {
		Contacto  cl= new Contacto();
		model.addAttribute("contacto", cl);
		System.out.println("model");
		return "datos";
	}
	
		
	@PostMapping(value="/doAlta")
	public String alta(@ModelAttribute ("contacto") Contacto contacto){
		template.postForLocation(url, contacto);		
        return "entrada";
	}
	
	
	
	
}
