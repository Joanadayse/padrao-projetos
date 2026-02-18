package one_digital.padrao_projetos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String produto;
	private double valor;
	
	
	 public Pedido() {}
	 
	 public Pedido(String produto, double valor) {
	        this.produto = produto;
	        this.valor = valor;
	    }
	 
	 public Long getId() {
	        return id;
	    }



	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
