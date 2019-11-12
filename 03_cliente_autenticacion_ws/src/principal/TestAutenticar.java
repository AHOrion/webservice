package principal;

import java.rmi.RemoteException;

import controller.AutenticacionController;
import controller.AutenticacionControllerProxy;
import javabeans.Cliente;

public class TestAutenticar {

	public static void main(String[] args) throws RemoteException {
		String user="test1";
		String pass="test1";
		AutenticacionController px;
		AutenticacionControllerProxy proxy=new AutenticacionControllerProxy();
		px=proxy.getAutenticacionController();
		
		if(px.autenticarCliente(user, pass)) {
			Cliente cli= px.obtenerCliente(user, pass);
			System.out.println("El usuario existe" + cli);
			
		}else {
			System.out.println("El usuario NO existe");
		}
		
		

	}

}
