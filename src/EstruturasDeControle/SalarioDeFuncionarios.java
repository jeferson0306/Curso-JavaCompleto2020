package estruturasdecontrole;
import java.util.Scanner;
public class SalarioDeFuncionarios {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("\nInforme o segundo sal�rio:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("\nInforme o terceiro sal�rio:");
		String valor3 = entrada.next().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3 / 3);
		System.out.printf("\nA m�dia dos sal�rios � %.2f", media);
		
		entrada.close();
		
	}
}
