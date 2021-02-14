package EstruturasDeControle;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//número 2 == 2
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		
		//número 2 é == string 2 (não, são diferentes, número int/double, etc versus string
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		// número 2 na entrada é string versus número 2 println
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //trim = tirar espaços na entrada
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}