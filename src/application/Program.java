package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Account conta;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter account number: ");
		Integer numeroConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			Double amount = sc.nextDouble();
			conta = new Account(numeroConta, nomeTitular, amount);
		} else {
			conta = new Account(numeroConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.print("Enter deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.withdraw(saque);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
