package aplicacao;

import java.util.Scanner;

import entidade.Aluno;
import entidade.NotasTrimestre;

public class Program3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		NotasTrimestre notas= new NotasTrimestre();
		
		System.out.println("Digite Nome do Aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Digite a Nota do Primeiro Trimestre : ");
		notas.primeiroTrimestre = scan.nextDouble();
		
		System.out.println("Digite a Nota do Segundo Trimestre : ");
		notas.segundoTrimestre = scan.nextDouble();
		
		System.out.println("Digite a Nota do Terceiro Trimestre : ");
		notas.TerceiroTrimestre = scan.nextDouble();
		
		
		System.out.println("O Aluno : "+aluno.nome+", Obteve Nota Total De : "+notas.notaTotalAluno());
		
		if (notas.aprovadoReprovado() > 0) {
			System.out.println("Aluno REPROVADO faltou : "+notas.aprovadoReprovado()+" Pontos.");
		}
		else
		{
			System.out.println("Aluno APROVADO.");
		}
		

		
		scan.close();
	}

}
