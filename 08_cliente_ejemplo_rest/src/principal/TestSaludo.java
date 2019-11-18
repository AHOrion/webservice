package principal;


import org.springframework.web.client.RestTemplate;

import model.Item;


public class TestSaludo {

  public static void main (String [] args) {
	  String url="http://localhost:8080/06_ejemplo_rest_spring/saludo";
		RestTemplate template=new RestTemplate();
		//llamada a primer recurso
		String resultado=template.getForObject(url, String.class);
		System.out.println("Respuesta primer recurso "+resultado);
		//llamada a segundo recurso
		String resultado2=template.getForObject(url+"/profe", String.class);
		System.out.println("Respuesta segundo recurso "+resultado2);
		//llamada a tercer recurso
		Item item=template.getForObject(url, Item.class);
		System.out.println("Respuesta tercer recurso "+item.getNombre()+"-"+item.getEmail());
		//llamada al cuarto recurso
		Item it=new Item("prueba","prueba@gmail.com",99);
		String resultado3=template.postForObject(url, it, String.class);
		System.out.println("Respuesta cuarto recurso "+resultado3);
		//llamada al quinto recurso
		template.delete(url+"/testing");
	
			  
  }
	
	
}
