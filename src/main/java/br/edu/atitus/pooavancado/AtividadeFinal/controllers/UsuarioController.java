package br.edu.atitus.pooavancado.AtividadeFinal.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Produto;
import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Usuario;
import br.edu.atitus.pooavancado.AtividadeFinal.services.GenericService;
import br.edu.atitus.pooavancado.AtividadeFinal.services.ProdutoService;
import br.edu.atitus.pooavancado.AtividadeFinal.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioController extends GenericController<Usuario>{

	final UsuarioService usuarioService;
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@Override
	GenericService<Usuario> getService() {
		return usuarioService;
	}

	@PatchMapping("/status/{id}")
	public ResponseEntity<Object> alteraStatusUsuario(@PathVariable long id) {
		try {
			usuarioService.alteraStatus(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body("Status alteado com sucesso para o usuario com Id " + id);
	}
	
	@GetMapping()
	public ResponseEntity<Object> getEntidades(@PageableDefault(page = 0, size = 5, sort = "id", direction = Direction.ASC) Pageable pageable, @RequestParam String nome) throws Exception {	
		Page<Usuario> usuarios = usuarioService.findByNome(pageable, nome);
			return ResponseEntity.status(HttpStatus.OK).body(usuarios);
	}

	

}
