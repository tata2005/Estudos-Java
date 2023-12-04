package entities;

public class ContaBancaria {

	//atributos
	
	private Integer numeroConta;
	private String titular;
	protected Double saldo;
	
	//construtores
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(Integer numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	//métodos gets
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	//métodos 
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void sacar(Double valor) {
		saldo -= valor;
	}
	
	public Double calcularRendimentoMensal() {
		return saldo;
	}
}
