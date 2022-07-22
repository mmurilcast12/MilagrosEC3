package com.idat.EC3MilagrosMurilloReservaCitas.dto;

public class ClienteDTOResponse {
	
	private Integer idCliente;
	private String nombre;
	private String celular;
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public ClienteDTOResponse(Integer idCliente, String nombre, String celular) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.celular = celular;
	}
	public ClienteDTOResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
