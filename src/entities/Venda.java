package entities;

import java.math.BigDecimal;

public class Venda {

	private String nomeProduto;
	private BigDecimal precoProduto;
	private String nomeCliente;
		
	public Venda(String nomeProduto, BigDecimal precoProduto, String nomeCliente) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public String toString() {
		return "produto: " + nomeProduto + "\npreço: " + precoProduto + "\ncliente: " + nomeCliente;
	}
	
	public Venda () {
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
