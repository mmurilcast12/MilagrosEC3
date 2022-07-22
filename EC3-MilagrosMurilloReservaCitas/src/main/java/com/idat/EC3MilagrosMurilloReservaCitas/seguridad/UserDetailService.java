package com.idat.EC3MilagrosMurilloReservaCitas.seguridad;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.EC3MilagrosMurilloReservaCitas.modelo.Cliente;
import com.idat.EC3MilagrosMurilloReservaCitas.modelo.UsuarioCliente;
import com.idat.EC3MilagrosMurilloReservaCitas.repositorio.UsuarioClienteRepository;



@Service
public class UserDetailService implements UserDetailsService{
	
	@Autowired
	private UsuarioClienteRepository repositorio;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UsuarioCliente usuariocliente = repositorio.findByUsuarioCliente(username);
		if(usuariocliente != null) {
			
			List<GrantedAuthority> granted = new ArrayList<GrantedAuthority>();
			GrantedAuthority authority = new SimpleGrantedAuthority(usuariocliente.getRol());
			granted.add(authority);
			
			return new User(usuariocliente.getIdUsuario(), usuariocliente.getPassword(), granted);
			
		}else {
			throw new UsernameNotFoundException("Usuario no existe");
		}
	}

}
