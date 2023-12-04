package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ContaBancaria;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List<ContaBancaria> listaDeConta = new ArrayList<>();
		
		Integer numeroConta;
		String titular;
		Double saldo;
		Double limiteChequeEspecial;
		Double taxaRendimento;
		
		System.out.print("Quantas contas serao adicionadas: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.println();
			System.out.println("Digite os dados da #" + i + " conta: ");
			System.out.print("Conta corrente ou  poupança (c/p)? ");
			char y = sc.next().charAt(0);
			if(y == 'c') {
				System.out.print("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.print("Nome do titular: ");
				sc.nextLine();
				titular = sc.nextLine();
				System.out.print("Saldo: ");
				saldo = sc.nextDouble();
				System.out.print("Limite do cheque especial: ");
				limiteChequeEspecial = sc.nextDouble();
				
				listaDeConta.add(new ContaCorrente(numeroConta, titular, saldo, limiteChequeEspecial));
			}if(y == 'p') {
				System.out.print("Numero da conta: ");
				numeroConta = sc.nextInt();
				System.out.print("Nome do titular: ");
				sc.nextLine();
				titular = sc.nextLine();
				System.out.print("Saldo: ");
				saldo = sc.nextDouble();
				System.out.print("Taxa de rendimento: ");
				taxaRendimento = sc.nextDouble();
				
				listaDeConta.add(new ContaPoupanca(numeroConta, titular, saldo, taxaRendimento));
			}
			
		}
		
		for(ContaBancaria conta : listaDeConta) {
			System.out.println("Titular: " + conta.getTitular() + " - Numero da conta: " + conta.getNumeroConta() + " - Rendimento da conta: " + conta.calcularRendimentoMensal() + " Reais");
		}
		
	}

}
