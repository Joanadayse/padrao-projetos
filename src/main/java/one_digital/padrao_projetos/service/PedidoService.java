package one_digital.padrao_projetos.service;


import java.util.List;

import org.springframework.stereotype.Service;

import one_digital.padrao_projetos.model.Pedido;

import one_digital.padrao_projetos.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final PedidoRepository repository;
	
	public PedidoService(PedidoRepository repository) {
		this.repository= repository;
	}
	
	public List<Pedido>listar(){
		return repository.findAll();
	}
	
	public Pedido salvar (Pedido pedido) {
		return repository.save(pedido);
	}
	
	public Pedido buscarPorId(Long id) {
		return repository.findById(id).orElseThrow();
		
	}

}
