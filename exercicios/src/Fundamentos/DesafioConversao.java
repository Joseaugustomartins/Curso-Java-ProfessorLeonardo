package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu antipenultimo salario: ");
		String salario1 = sc.nextLine().replace(",", ".");
		
		System.out.print("Digite seu penultimo salario: ");
		String salario2 = sc.nextLine().replace(",", ".");
		
		System.out.print("Digite seu ultimo salario: ");
		String salario3 = sc.nextLine().replace(",", ".");
		
		double salarioN1 = Double.parseDouble(salario1);
		double salarioN2 = Double.parseDouble(salario2);
		double salarioN3 = Double.parseDouble(salario3);
		
		double soma = salarioN1 + salarioN2 + salarioN3;
		
		System.out.println("A media dos 3 ultimos salarios e: "
				+ soma / 3);
		
		sc.close();
	}
}
