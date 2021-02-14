package EstruturasDeControle;
import java.util.Scanner;
public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		// Wrappers são a versão objeto dos tipos primitivos! tipo int, etc.
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //int
		Long l = 100000L; //precisa do L no final
		
		System.out.println(b);
		System.out.println(l);
		
		System.out.println(s.shortValue());
		System.out.println(s.toString());
		System.out.println(i);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Double d = 123.5678;
		System.out.println(d);
		
		Character c = '#';
		System.out.println(c + " ... ");
		
		entrada.close();
	}
}
