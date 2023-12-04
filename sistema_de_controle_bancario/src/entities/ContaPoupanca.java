package entities;

public class ContaPoupanca extends ContaBancaria {

	//atributos
	
	private Double taxaRendimento;
	
	//construtores
	
	public ContaPoupanca() {
		
	}

	public ContaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaRendimento) {
		super(numeroConta, titular, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	//metodos
	
	public Double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	@Override
	public Double calcularRendimentoMensal() {
		return saldo * taxaRendimento;
	}
}
