package com.idat.EC3MilagrosMurilloReservaCitas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;
import com.idat.EC3MilagrosMurilloReservaCitas.modelo.UsuarioCliente;
import com.idat.EC3MilagrosMurilloReservaCitas.servicio.UsuarioClienteService;

@Controller
@RequestMapping("/api/v1/usuariocliente")
public class UsuarioClienteController {
			

		@Autowired
		private UsuarioClienteService service;
		
		
		@GetMapping("/listar")
		public @ResponseBody List<UsuarioCliente> listarUsuarioClientes(){
			return service.listarUsuarioClientes();
		}
		
		@GetMapping("/listar/{id}")
		public @ResponseBody Cliente obtenerUsuarioCliente(@PathVariable Integer id){
			return null;
		}
		
		@PostMapping("/guardar")
		public @ResponseBody void guardarUsuarioClientes(@RequestBody Cliente cliente) {
			service.guardarUsuarioClientes(cliente);
		}
		
		@PutMapping("/actualizar")
		public void actualizarUsuarioClientes(@RequestBody Cliente cliente) {
			
		}
		
		@DeleteMapping("/eliminar/{id}")
		public void eliminarUsuarioClientes(@PathVariable Integer id) {
			
		}
		
	}