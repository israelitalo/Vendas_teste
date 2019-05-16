package Main;

import java.math.BigDecimal;
import java.util.Scanner;

import entities.Cliente;
import entities.Produto;
import entities.Venda;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Produto produto1 = new Produto ();
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = sc.next();
		produto1.setNome(nomeProduto);
		System.out.print("Digite o preço produto: ");
		BigDecimal precoProduto = sc.nextBigDecimal();
		produto1.setPreco(precoProduto);

		Cliente cliente1 = new Cliente ();
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.next();
		cliente1.setNome(nomeCliente);
		
		Venda venda = new Venda();
		venda.setNomeCliente(nomeCliente);
		venda.setNomeProduto(nomeProduto);
		venda.setPrecoProduto(precoProduto);
		
		System.out.println("Produto: " + produto1.getNome());
		System.out.println("Cliente: " + cliente1.getNome());
		
		System.out.println("-----Dados da Venda-----");
		System.out.println(venda);
		
		sc.close();
	}

}
