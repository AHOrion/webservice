package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dtos.DtoCliente;
import model.Cliente;
import service.ServiceClientes;


@RestController
public class LoginController {
	@Autowired
	ServiceClientes sClientes;
	@GetMapping(value = "/login/{user}/{pwd}",produces=MediaType.APPLICATION_JSON_VALUE)
	public DtoCliente login(@PathVariable("user") String user, 
						    @PathVariable("pwd")String pwd
						) {
		Cliente cliente=sClientes.getCliente(user, pwd);
		DtoCliente dtoCliente=new DtoCliente(cliente.getIdCliente(),
				cliente.getEmail(),
				cliente.getPassword(),
				cliente.getTelefono(),
				cliente.getUsuario());
				
		return dtoCliente;
		
	}
	
}
