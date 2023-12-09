package Fundamentos.Operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recuperacao" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "nao";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
