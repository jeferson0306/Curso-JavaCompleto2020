package estruturasdecontrole;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	private static final String US = null;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe um n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a opera��o ");
		String op = entrada.next();
		
		// L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}
}