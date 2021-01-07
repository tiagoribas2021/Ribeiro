package Aplicacao;

import java.util.Scanner;

import Util.ConverteMoedas;

public class Program4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ConverteMoedas moeda = new ConverteMoedas();

		System.out.println("Cotação Atualo do Dolar $ : ");
		moeda.valorCotacao = scan.nextDouble();

		System.out.println("Quantos Doláres deseja Comprar ? : ");
		moeda.qtdMoeda = scan.nextDouble();

		System.out.println("Valor Em Reais : " + moeda.calculaValorTotal());

		scan.close();
	}

}
