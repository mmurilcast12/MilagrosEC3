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

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Hospital;
import com.idat.EC3MilagrosMurilloReservaCitas.servicio.HospitalService;


@Controller
@RequestMapping("/api/v1/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospital> listarHospitales(){
		return service.listarHospitales();
	}
	
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Hospital obtenerHospital(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarHospitales(@RequestBody Hospital hospital) {
		service.guardarHospitales(hospital);
	}

	
	@PutMapping("/actualizar")
	public void actualizarHospital(@RequestBody Hospital hospital) {
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarHospital(@PathVariable Integer id) {
		
	}

}
