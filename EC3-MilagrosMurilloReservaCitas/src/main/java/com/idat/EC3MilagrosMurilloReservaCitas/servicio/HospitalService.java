package com.idat.EC3MilagrosMurilloReservaCitas.servicio;

import java.util.List;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Hospital;


public interface HospitalService {
	
	public List<Hospital> listarHospitales();
	public Hospital obtenerHospital();
	public void guardarHospitales(Hospital hospital);
	public void actualizarHospital(Hospital hospital);
	public void eliminarHospital();

}
