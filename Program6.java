package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;

public class Program6 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantidade Produtos : ");

		int qtd = scan.nextInt();

		List<Produto> lista = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {

			System.out.print("Qual o Tipo do Produto (C / U / I) ?");
			char ch = scan.next().charAt(0);

			System.out.print("Nome : ");
			String nome = scan.next();

			if (ch == 'C') {
				System.out.print("preco : ");
				Double preco = scan.nextDouble();

				lista.add(new Produto(nome, preco));
			} else if (ch == 'I') {

				System.out.print("preco : ");
				Double preco = scan.nextDouble();

				System.out.print("Taxa Alfandega : ");
				Double taxaAlfandega = scan.nextDouble();

				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			} else {

			}

		}

		for (Produto prod : lista) {
			System.out.println(prod.toString());
		}

		scan.close();

	}
}
