package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Boa noite x";
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X","Jose")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitvos nao tem o operador "."
	}
}
