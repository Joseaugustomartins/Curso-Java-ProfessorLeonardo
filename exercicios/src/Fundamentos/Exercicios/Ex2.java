package Fundamentos.Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos celsius você quer transformar em graus: ");
		double celsius = sc.nextDouble();
		
		double grau = (celsius - 32) / 1.8;
		
		System.out.println(grau);
		
		sc.close();
	}
}
