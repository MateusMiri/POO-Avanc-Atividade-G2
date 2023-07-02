package br.edu.atitus.pooavancado.AtividadeFinal.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Usuario;

public interface UsuarioService extends GenericService<Usuario>, UserDetailsService{
	
	void alteraStatus(long id) throws Exception;

}
