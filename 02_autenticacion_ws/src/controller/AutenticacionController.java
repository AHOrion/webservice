package controller;

import factories.FactoryDao;
import javabeans.Cliente;
import modelo.DaoClientes;


public class AutenticacionController {
	
	public boolean autenticarCliente(String usuario, String password) {
		DaoClientes gestion= FactoryDao.getDaoClientes();
		return gestion.autenticar(usuario, password);
		
	}
	public Cliente obtenerCliente(String usuario, String password) {
		DaoClientes gestion= FactoryDao.getDaoClientes();
		return gestion.getCliente(usuario, password);
		
	}
	
	
}
