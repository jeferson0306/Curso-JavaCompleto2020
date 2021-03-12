package estruturasdecontrole;
public class Aritimeticos {

	public static void main(String[] args) {
		
		// 1ª forma:
		System.out.println(2 + 3);
		
		// 2ª forma, e melhor:
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		// 3ª forma, 2ª forma + casting:
		int a = 8 ;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // normal
		System.out.println(a / (double) b); //casting
		System.out.println(a / (float) b); //casting de menor precisão
		
		//calculo com mod - resto da divisão:
		System.out.println(a % b);
		System.out.println(8 % 3); //mesma coisa, sem declarar variáveis
		
	}

}
