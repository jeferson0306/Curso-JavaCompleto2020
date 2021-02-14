package EstruturasDeControle;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		double nota = entrada.nextDouble();
		
		if (nota >= 5.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		else {
			System.out.println("Reprovado");
		}
	}

}
