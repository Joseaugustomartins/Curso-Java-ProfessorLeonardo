package Fundamentos.Operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		//int a = 2 + 3 *4;
		// int b = Math.pow(a, 3);
		
		int parte1cima =  (3 + 2) * 6;
		int a1 = (int)Math.pow(parte1cima, 2);
		int totalparte1 = a1 / (3 * 2);
		
		int parte2cima = (1 - 5) * (2 - 7);
		int a2 = parte2cima / 2;
		int totalparte2 = (int)Math.pow(a2, 2);
		
		int totalcima = totalparte1 - totalparte2;
		int a = (int)Math.pow(totalcima, 3);
		int b = (int)Math.pow(10, 3);
		
		int valortotal = a / b;
		
		System.out.println("O valor da primeira operaçao e: " + totalparte1);
		System.out.println("O valor da segunda operaçao e: " + totalparte2);
		System.out.println("O valor da operaçao de cima e: " +totalcima);
		System.out.println("O valor final da operaçao e: " +valortotal);
	}
}
