package br.com.fiap.loja.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.singleton.PropertySingleton;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {

	public static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {

		ProdutoTO p = new ProdutoTO();
		System.out.print("Diga o código do produto: ");
		p.setCodigoProduto(leitor.nextInt());

		leitor.close();

		LocalDate hoje = LocalDate.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Properties prop = PropertySingleton.getInstance();
		System.out.println("Na loja " + prop.getProperty("nome") + ": " + hoje.format(formatador) + " ");
		System.out.println(EstoqueBO.consultarProduto(p).getDescricao());
		prop.clear();

	}

}
