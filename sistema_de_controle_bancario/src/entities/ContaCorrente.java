package entities;

public class ContaCorrente extends ContaBancaria {

	//atributos
	
	private Double limiteChequeEspecial;
	
	//contrutores
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(Integer numeroConta, String titular, Double saldo, Double limiteChequeEspecial) {
		super(numeroConta, titular, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	//metodos
	
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	@Override
	public Double calcularRendimentoMensal() {
		return saldo * 0.05;
	}
	
}
