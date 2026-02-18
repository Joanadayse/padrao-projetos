package one_digital.padrao_projetos.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import one_digital.padrao_projetos.model.Pedido;
import one_digital.padrao_projetos.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	private final PedidoService service;
	
	public PedidoController(PedidoService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Pedido>listar(){
		return service.listar();
				
	}
	
	@PostMapping
	public Pedido criar(@RequestBody Pedido pedido) {
		return service.salvar(pedido);
	}
	
	@GetMapping("/{id}")
	public Pedido buscar(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

}
