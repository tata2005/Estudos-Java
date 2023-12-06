package entities;

public class Eletronicos extends Produto {

	private int voltagem;
	
	public Eletronicos(String nome, Double preco, int quantidadeEmEstoque, int voltagem) {
		super(nome, preco, quantidadeEmEstoque);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	@Override
	public Double calcularEnvio() {
		return preco * 0.40;
	}
}
