package one_digital.padrao_projetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one_digital.padrao_projetos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido , Long> {

}
