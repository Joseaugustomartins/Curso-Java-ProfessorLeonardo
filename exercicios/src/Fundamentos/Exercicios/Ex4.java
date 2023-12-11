package Fundamentos.Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o valor: ");
		double n1 = entrada.nextDouble();
		
		double quadrado = Math.pow(n1, 2);
		double cubo = Math.pow(n1, 3);
		
		System.out.println("Quadrado: " + quadrado);
		System.out.println("Cubo: " + cubo);
		
		
		entrada.close();
	}
}
