package estruturasdecontrole;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		// n�o usar ; (ponto v�rgula) em estruturas de controle (tem uma exce��o)
		
		Scanner entrada = new Scanner(System.in);
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0); {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		if (media < 7 && media >= 4.5) 
			System.out.println("Recupera��o");
		
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}