package com.idat.EC3MilagrosMurilloReservaCitas.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Table(name="cliente")
@Entity
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8780089593647040335L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String celular;
	
	@ManyToMany(mappedBy = "hospitales", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Hospital> hospitales = new ArrayList<Hospital>();
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public Cliente() {
		super();
	
	}
	public Cliente(Integer idCliente, String nombre, String celular) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.celular = celular;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}	
}
