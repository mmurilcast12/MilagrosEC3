package com.idat.EC3MilagrosMurilloReservaCitas.seguridad;


import java.io.IOException;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class EntryPoint implements AuthenticationEntryPoint{
	
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException{
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Usuario no autorizado");
	}


}
