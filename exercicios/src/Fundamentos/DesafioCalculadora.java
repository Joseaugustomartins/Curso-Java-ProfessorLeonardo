package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o primeiro valor: ");
		double n2 = entrada.nextDouble();

		System.out.print("Qual simbolo irá usar? ");
		String n3 = entrada.next();

		double resultado = "+".equals(n3) ? n1 + n2 : 0;
		resultado = "-".equals(n3) ? n1 - n2 : resultado;
		resultado = "*".equals(n3) ? n1 * n2 : resultado;
		resultado = "/".equals(n3) ? n1 / n2 : resultado;
		resultado = "%".equals(n3) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, n3, n2, resultado);
		
		entrada.close();
	}
}
