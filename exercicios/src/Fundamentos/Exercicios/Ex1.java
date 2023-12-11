package Fundamentos.Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos graus você quer transformar em celsius: ");
		double grau = sc.nextDouble();
		
		double celsius = grau * 1.8 + 32;
		
		System.out.println(celsius);
		
		sc.close();
	}
}
