package entidade;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double calculaSalarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double calculaSalarioComAumento(double perc) {
		
		double valorAumento = (salarioBruto * perc) / 100;
		return (salarioBruto + valorAumento) - taxa;
	}
	
}
