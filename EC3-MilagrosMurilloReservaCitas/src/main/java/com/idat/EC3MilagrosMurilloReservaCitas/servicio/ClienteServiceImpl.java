package com.idat.EC3MilagrosMurilloReservaCitas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;
import com.idat.EC3MilagrosMurilloReservaCitas.repositorio.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}
	
	
	@Override
	public Cliente obtenerClientes() {		

		return null;
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		repository.save(cliente);
	}
	
	
	@Override
	public void actualizarClientes(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarClientes() {
		// TODO Auto-generated method stub

	}

}
