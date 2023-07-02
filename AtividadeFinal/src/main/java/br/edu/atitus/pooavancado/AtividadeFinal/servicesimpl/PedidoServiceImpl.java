package br.edu.atitus.pooavancado.AtividadeFinal.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.AtividadeFinal.Entities.Pedido;
import br.edu.atitus.pooavancado.AtividadeFinal.repositories.PedidoRepository;
import br.edu.atitus.pooavancado.AtividadeFinal.services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	final PedidoRepository departamentoRepository;
	public PedidoServiceImpl(PedidoRepository departamentoRepository) {
		super();
		this.departamentoRepository = departamentoRepository;
	}
	
	@Override
	public PedidoRepository getRepository() {
		return departamentoRepository;
	}

	@Override
	public void validarSave(Pedido objeto) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
