package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;
	
	public PessoaFisica() {
	}

	

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}



	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calculoImposto() {
		double valor = 0;
		 if(rendaAnual <= 20000.0 && gastosSaude > 0) {
			valor = (rendaAnual * 0.15)-(gastosSaude * 0.5);
		}if(rendaAnual > 20000.0 && gastosSaude > 0) {
			valor = (rendaAnual * 0.25)-(gastosSaude * 0.5);
		}if(rendaAnual <= 20000.0 && gastosSaude == 0) {
			valor = (rendaAnual * 0.15);
		}if(rendaAnual > 20000.0 && gastosSaude == 0) {
			valor = (rendaAnual * 0.25);
		}
		return valor;
	}
}
