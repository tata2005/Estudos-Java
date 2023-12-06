package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		String nome;
		Double rendaAnual;
		Double gastosSaude;
		int numeroFuncionario;
		
		System.out.print("Digite o numero de contribuintes: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x;i++) {
			System.out.println();
			System.out.println("Dados do contribuinte nº "+i+":");
			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char y = sc.next().charAt(0);
			if(y == 'f') {
				System.out.print("Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Renda anual: ");
				rendaAnual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				gastosSaude = sc.nextDouble();
				
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}if(y == 'j') {
				System.out.print("Nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("Renda anual: ");
				rendaAnual = sc.nextDouble();
				System.out.print("Numero de funcionarios: ");
				numeroFuncionario = sc.nextInt();
				
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("VALOR DO IMPOSTO: ");
		
		for(Pessoa p: lista) {
			System.out.printf("%s: $ %.2f%n", p.getNome(), p.calculoImposto());
		}
		
		double soma = 0;
		for(Pessoa p: lista) {
			soma += p.calculoImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL DO IMPOSTO: $ %.2f%n", soma);
	}

}
