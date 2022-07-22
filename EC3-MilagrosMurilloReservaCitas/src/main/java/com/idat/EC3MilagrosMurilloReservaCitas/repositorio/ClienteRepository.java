package com.idat.EC3MilagrosMurilloReservaCitas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	
	
	

}
