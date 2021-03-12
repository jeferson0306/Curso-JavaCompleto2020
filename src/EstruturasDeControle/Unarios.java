package estruturasdecontrole;

public class Unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		
		//com menos pressa
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		//com mais pressa
		b++; // b = b + 1;
		b--; // b = b - 1;
	
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio: \n");
		System.out.println(++a == b--); // a=2 e b=2 - 1
		System.out.println(a == b); // a=2 e b=2 - 1 ... a = 2 e b=1
		System.out.println(a);
		System.out.println(b);
				
	}

}
