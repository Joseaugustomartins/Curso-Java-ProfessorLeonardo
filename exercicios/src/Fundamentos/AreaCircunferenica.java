package Fundamentos;

public class AreaCircunferenica {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		
		double resultado = PI * raio * raio;
		System.out.println("Area = " +resultado);
		
		raio = 10;
		resultado = PI * raio * raio;
		System.out.println("Area = " + resultado);
	}
}
