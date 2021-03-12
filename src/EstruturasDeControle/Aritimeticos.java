package estruturasdecontrole;
public class Aritimeticos {

	public static void main(String[] args) {
		
		// 1� forma:
		System.out.println(2 + 3);
		
		// 2� forma, e melhor:
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		// 3� forma, 2� forma + casting:
		int a = 8 ;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // normal
		System.out.println(a / (double) b); //casting
		System.out.println(a / (float) b); //casting de menor precis�o
		
		//calculo com mod - resto da divis�o:
		System.out.println(a % b);
		System.out.println(8 % 3); //mesma coisa, sem declarar vari�veis
		
	}

}
