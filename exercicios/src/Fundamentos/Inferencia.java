package Fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // declaraçao e inicializaçao
		System.out.println(a);
		
		var b = 5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // usada!
		
		var f = 12; //inteiro
		/* f = 12.01; uma vez criada com valores inteiros voce nao consegue colocar casa decimais
		porem o contrario segue verdadeiro*/
		System.out.println(f);
	}
}
