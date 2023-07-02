package br.edu.atitus.pooavancado.AtividadeFinal.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Produto;
import br.edu.atitus.pooavancado.AtividadeFinal.services.GenericService;
import br.edu.atitus.pooavancado.AtividadeFinal.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController extends GenericController<Produto> {

	final ProdutoService produtoService;
	public ProdutoController(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}

	@Override
	GenericService<Produto> getService() {
		return produtoService;
	}
}
