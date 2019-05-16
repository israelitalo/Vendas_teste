package entities;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal preco;
	
	public Produto(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto () {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
