package Fundamentos.Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		double base = sc.nextDouble();
		
		System.out.print("Digite o vlaor da altura: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área desse triângulo e: " + area);
		
		sc.close();
	}
}
