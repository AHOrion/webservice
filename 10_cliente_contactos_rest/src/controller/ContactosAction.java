package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import model.Contacto;

@Controller
public class ContactosAction {

	@Autowired
	RestTemplate template;
	String url ="http://localhost:8080/07_crud_contactos_rest/contacto";
	
	@GetMapping(value="/doContactos")
	public String obtenerContactos(HttpServletRequest request)	{  
		
		//me devuelve un JSON, que es un array de Contactos
		Contacto [] contactos= template.getForObject(url, Contacto[].class); 
		System.out.println("contactos: " + contactos);
        request.setAttribute("contactos", contactos); 
        return "contactos";
	}
	
	@GetMapping(value="/doEliminar")
	public String eliminar(@RequestParam("idContacto") int idContacto) { 
		System.out.println("idContacto :" + idContacto);
		template.delete(url+"/"+idContacto);
		return "forward:/doContactos";
	}

	
	
	
	
	
}
