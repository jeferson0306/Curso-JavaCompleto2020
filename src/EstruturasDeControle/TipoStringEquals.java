package EstruturasDeControle;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//n�mero 2 == 2
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		
		//n�mero 2 � == string 2 (n�o, s�o diferentes, n�mero int/double, etc versus string
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		// n�mero 2 na entrada � string versus n�mero 2 println
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //trim = tirar espa�os na entrada
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}