package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		Account account;
		
		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o Titular: ");
		sc.nextLine();
		String holder = sc.next();
		
		System.out.print("Gostaria de depositar: ");
		char resp = sc.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			System.out.print("Digite o Deposito Inicial: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println(account);
		System.out.println();
		
		System.out.print("Digite o Deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println(account);
		System.out.println();
		
		System.out.print("Digite o saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		sc.close();
	}
}
