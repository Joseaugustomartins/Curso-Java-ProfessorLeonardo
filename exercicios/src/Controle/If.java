package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informa a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		else
			System.out.println("Reprovado");
		
		
		entrada.close();
	}
}