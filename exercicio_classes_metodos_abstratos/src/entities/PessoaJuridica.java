package entities;

public  class PessoaJuridica extends Pessoa {

	private int numeroFuncionario;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	
	@Override
	public Double calculoImposto() {
		double valor = 0;
		 if(numeroFuncionario > 10) {
			 valor = rendaAnual * 0.14;
		 }else {
			 valor = rendaAnual *0.16;
		 }
		return valor;
	}
	
}
