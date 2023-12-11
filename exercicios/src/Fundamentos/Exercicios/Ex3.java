package Fundamentos.Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual sua altura: ");
		double altura = sc.nextDouble();
		System.out.print("Qual seu peso atual: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print("IMC: " + imc);
		
		sc.close();
	}
}
