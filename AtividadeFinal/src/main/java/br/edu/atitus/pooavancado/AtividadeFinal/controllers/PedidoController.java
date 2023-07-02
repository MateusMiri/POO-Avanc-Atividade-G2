package br.edu.atitus.pooavancado.AtividadeFinal.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Pedido;
import br.edu.atitus.pooavancado.AtividadeFinal.services.PedidoService;
import br.edu.atitus.pooavancado.AtividadeFinal.services.GenericService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pedidos")
public class PedidoController extends GenericController<Pedido>{

	final PedidoService departamentoService;
	public PedidoController(PedidoService departamentoService) {
		super();
		this.departamentoService = departamentoService;
	}
	
	@Override
	GenericService<Pedido> getService() {
		return departamentoService;
	}
}
