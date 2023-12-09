package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(°F -32) * 5/9.0 = °C (Formula para ser usada)
		
		double temperatura = 86;
		final double x = 32;
		final double fator = 5/9.0;
		
		double soma = (temperatura - x) * fator;
		
		System.out.println("Fahrenheint = " + temperatura + "°F.");
		System.out.println("Grau Celsius = " + soma + "°C.");
	}
}
