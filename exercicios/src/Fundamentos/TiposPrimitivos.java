package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informaçoes do funcionario
		
		//Tipos numericoss inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id +": ganha -> " + salario);
		System.out.println("ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
