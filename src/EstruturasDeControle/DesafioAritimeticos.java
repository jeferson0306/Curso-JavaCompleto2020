package estruturasdecontrole;
public class DesafioAritimeticos {

	public static void main(String[] args) {
	
		//Potenciação
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //devido ao casting, resultado com int
		double c = Math.pow(a, 3); //número com ponto fluante quando não faz casting
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Resolução do Exercício - pessoal:
		int x = (6 * (3 + 2));
		int y = (int)Math.pow(x, 2);
		int z = y / (3 * 2);
		System.out.println(z);
		
		int m = ((1 - 5) * (2 - 7)) / 2;
		int n = (int)Math.pow(m, 2);
		System.out.println(n);
		
		int o = (z - n);
		System.out.println(o);
		
		int p = (int)Math.pow(o, 3);
		
		int q = (int)Math.pow(10, 3);
		System.out.println(q);
		
		int r = p / q;
		System.out.println(r);
		
		
		//Resolução do Exercício - professor:
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
	}
}
