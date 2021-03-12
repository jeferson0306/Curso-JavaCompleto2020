package estruturasdecontrole;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		// não usar ; (ponto vírgula) em estruturas de controle (tem uma exceção)
		
		Scanner entrada = new Scanner(System.in);
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0); {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		if (media < 7 && media >= 4.5) 
			System.out.println("Recuperação");
		
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}