package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//if(...) setença; ou {}
		// while(...) setença; ou {}
		//for(...;...;...) setença; o {}
		
		//do{} while(...);
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		do {
			System.out.println("Você precisar falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			valor = entrada.nextLine();
		}while(!valor.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
