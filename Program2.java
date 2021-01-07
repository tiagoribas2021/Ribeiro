package aplicacao;

import java.util.Scanner;

import entidade.Funcionario;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite Nome : ");
		funcionario.nome = scan.next();
		
		System.out.println("Digite Sálario Bruto : ");
		funcionario.salarioBruto = scan.nextDouble();
		
		System.out.println("Digite Valor Imposto : ");
		funcionario.taxa = scan.nextDouble();
		System.out.println("");
		
		System.out.println("Funcionário : "+funcionario.nome+" Sálario Liquido $ : "+funcionario.calculaSalarioLiquido());
		System.out.println("");
		
		System.out.println("Digite Percentual de Aumento : ");
		
		double percAlta = scan.nextDouble();
		System.out.println("");
		
		System.out.println("Funcionário : "+funcionario.nome+" Sálario Liquido Com Aumento $ : "+funcionario.calculaSalarioComAumento(percAlta));
		
		scan.close();
	}

}
