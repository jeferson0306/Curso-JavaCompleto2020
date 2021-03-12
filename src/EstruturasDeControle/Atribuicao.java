package estruturasdecontrole;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		
		//incremento
		c++; // c = c + 1;
		
		//decremento
		c--; // c = c - 1;
		
		System.out.println(c);
		
		// % ou mod = resto da divisão
		c %= 2; // c = % 2; 0 ou 1;
		System.out.println(c);
	}

}
