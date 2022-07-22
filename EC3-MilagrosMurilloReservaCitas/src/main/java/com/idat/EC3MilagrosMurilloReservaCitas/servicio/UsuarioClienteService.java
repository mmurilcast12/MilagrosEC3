package com.idat.EC3MilagrosMurilloReservaCitas.servicio;

import java.util.List;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;
import com.idat.EC3MilagrosMurilloReservaCitas.modelo.UsuarioCliente;


public interface UsuarioClienteService {
	
	public List<UsuarioCliente> listarUsuarioClientes();
	public UsuarioCliente obtenerUsuarioClientes();
	public void guardarUsuarioClientes(Cliente cliente);
	public void actualizarUsuarioClientes(UsuarioCliente usuariocliente);
	public void eliminarUsuarioClientes();

}
