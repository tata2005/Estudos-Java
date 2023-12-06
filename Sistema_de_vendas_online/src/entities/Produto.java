package entities;

public class Produto {

	private String nome;
	protected Double preco;
	private int quantidadeEmEstoque;
	
	public Produto(String nome, Double preco, int quantidadeEmEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public Double calcularEnvio() {
		return preco * 0.0;
	}
	
	
	
}
