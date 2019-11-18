package principal;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ListarPaises {

	public static void main(String[] args) throws ParseException {
		String url = "https://restcountries.eu/rest/v2/all";
		RestTemplate template = new RestTemplate();
		
		//Nos lo devuelve como String
//		String resultado=template.getForObject(url, String.class);
		ResponseEntity<String >  resp = template.getForEntity(url, String.class);
		if (resp.getStatusCodeValue()==200){
			String resultado=resp.getBody();
			System.out.println("Resultado: "+resultado);
			JSONParser parser=new JSONParser();
			JSONArray array = (JSONArray) parser.parse(resultado);
			for (Object ob : array) {
				JSONObject json=(JSONObject)ob;
			//name es el campo donde resultado tenia el pais
				System.out.println(json.get("name"));
		    }	
		}else {
			System.out.println("Errorrrr");
		}

	}

}
