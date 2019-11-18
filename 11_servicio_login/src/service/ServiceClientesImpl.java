package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.DaoCliente;
import daos.DaoVentas;
import model.Cliente;
import model.Venta;
@Service
public class ServiceClientesImpl implements ServiceClientes {
	@Autowired
	DaoCliente daoClientes;
	@Autowired
	DaoVentas daoVentas;
	@Override
	public Cliente getCliente(String user, String pass) {
		return daoClientes.findByUsuarioAndPassword(user, pass);
	}

	@Override
	public List<Venta> ventasCliente(int idCliente) {
		
		return daoVentas.recuperarVentasCliente(idCliente);
	}

	@Override
	public void guardarCliente(Cliente c) {
		if (!daoClientes.existsById(c.getIdCliente())) {
			daoClientes.save(c);
		}
		
	}

}
