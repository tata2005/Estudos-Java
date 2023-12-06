package entities;

public class Roupa extends Produto{

	private String tamanho;

	public Roupa(String nome, Double preco, int quantidadeEmEstoque, String tamanho) {
		super(nome, preco, quantidadeEmEstoque);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public Double calcularEnvio() {
		return preco * 0.30;
	}
}
