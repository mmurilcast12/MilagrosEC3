package com.idat.EC3MilagrosMurilloReservaCitas.servicio;

import java.util.List;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarClientes();
	public Cliente obtenerClientes();
	public void guardarClientes(Cliente cliente);
	public void actualizarClientes(Cliente cliente);
	public void eliminarClientes();
	
	
	

}
