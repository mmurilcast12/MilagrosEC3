package com.idat.EC3MilagrosMurilloReservaCitas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idat.EC3MilagrosMurilloReservaCitas.modelo.UsuarioCliente;



public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{
	
	UsuarioCliente findByUsuarioCliente(String usuariocliente);

}
