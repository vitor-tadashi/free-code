package com.tadashi.challenge;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// Dado a classe abaixo,
		// obter a variável somaPrecoProdutos preenchida
		Produto p1 = new Produto();
		p1.preco = 10;

		Produto p2 = new Produto();
		p2.preco = 30;

		List<Produto> produtos = Arrays.asList(p1, p2);
		Integer somaPrecoProdutos = produtos.stream().map(x -> x.preco).reduce(0, Integer::sum);

		System.out.println(somaPrecoProdutos);
	}

	static class Produto {
		Integer preco;
	}
}
