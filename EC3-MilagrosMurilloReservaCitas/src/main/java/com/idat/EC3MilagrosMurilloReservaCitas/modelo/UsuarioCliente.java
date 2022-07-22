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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "UsuarioCliente")
@Entity
public class UsuarioCliente implements Serializable{
	
	private Integer idUsuario;
	private String usuario;
	private String password;
	private String rol;
	
	@JoinColumn(name="idCliente",nullable = false, unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references Producto (id_cliente)"))
	
	@OneToOne
	private Cliente cliente;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public Cliente getClientes() {
		return cliente;
	}
	
	public void setClientes(Cliente clientes) {
		this.cliente = clientes;
	}
	
	public UsuarioCliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
