package controller;

public class CaracteresController {

	
	public int contarVocales(String cad) {
		int total=0;
	    cad = cad.toLowerCase();
		for (int i = 0; i < cad.length(); i++) {
			switch(cad.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			   total ++;
			   break;			
			}			
		}
		return total;
	}
}
