package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.12345; // explicita (CAST)
 		System.out.println(b);
 		
 		int c = 130;
 		byte d = (byte) c; // explicita (CAST)
 		System.out.println(d);
 		
 		double e = 1.999;
 		int f = (int) e;
 		System.out.println(f);
	}
}
