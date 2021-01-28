package Entidades;

public class ContaBancaria {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaBancaria() {

	}
	
	public ContaBancaria(Integer numero, String nome, Double saldo, Double limiteSaque) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito) {
		 saldo += valorDeposito;
	}
	
	public void retirada(double valorDeposito) {
		 saldo -= valorDeposito;
	}
}
