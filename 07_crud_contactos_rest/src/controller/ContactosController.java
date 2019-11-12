package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import daos.DaoContactos;
import model.Contacto;


@RestController
public class ContactosController {
	
	@Autowired
	DaoContactos dao;
	
//	public void altaContacto(Contacto contacto);
//	public void eliminarContacto(int idContacto)
//	public String obtenerAllContactos()
//	public Contacto buscarContactoByEmail(String email)
	
	
	@GetMapping(value="/contacto", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> buscarAllContactos() {
		List<Contacto> contactos = dao.recuperarContactos() ;
		return contactos;
	}
	@GetMapping(value="/contacto/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contacto buscarContactoByEmail(@PathVariable ("email") String email) {
		Contacto contacto = dao.recuperarContactoPorEmail(email);
		return contacto;
	}
	
	@DeleteMapping(value="/contacto/{idContacto}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String eliminarContacto(@PathVariable ("idContacto") int id) {
		Contacto contacto = dao.recuperarContactoPorIdContacto(id);
		if (contacto ==null) {
			return "No existe contacto";
		} else {
			dao.eliminarContacto(id);
			return "Baja del contacto " ;
		}
	}
	
	@PostMapping(value="/contacto", produces = MediaType.TEXT_PLAIN_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE)
	public String personalizado(@RequestBody Contacto contacto) {
		dao.altaContacto(contacto);
		return "Alta del contacto " ;
	}
//	@PutMapping(produces = MediaType.TEXT_PLAIN_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE)
//	public String actualizar(@RequestBody Contacto contacto) {
//		dao.contacto..
//		return "Actualizado del contacto " + contacto.getNombre();
//	}
	
	//Parametros en queryString o cuerpo ( usado en JS)
	@GetMapping(value="/contacto/actualiza")
	public void actualizar(@RequestParam("id") int idContacto, @RequestParam("email") String email) {
		
		
	}

}
