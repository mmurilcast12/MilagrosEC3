package com.idat.EC3MilagrosMurilloReservaCitas.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="hospital")
@Entity
public class Hospital implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9180896573992135979L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospital;
	private String nombre;
	private String descripcion;
	private Integer distrito;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="hospital_cliente",
	joinColumns=@JoinColumn(
			name = "id_cliente",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references Cliente (id_cliente)")),

	inverseJoinColumns = @JoinColumn(
			name = "id_hospital",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_hospital) references Productos (id_hospital)"))

	)

	private List<Cliente> clientes = new ArrayList<Cliente>();

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDistrito() {
		return distrito;
	}

	public void setDistrito(Integer distrito) {
		this.distrito = distrito;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Hospital(Integer idHospital, String nombre, String descripcion, Integer distrito, List<Cliente> clientes) {
		super();
		this.idHospital = idHospital;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.distrito = distrito;
		this.clientes = clientes;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
