package estruturasdecontrole;
import java.util.Scanner;

public class DesafioDiaSemana_JS {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		
		int dia = entrada.nextInt();
		
		if (dia > 7 || dia < 1) {
			System.out.println("Dia inválido!");
		} else if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda");
		} else if (dia == 3) {
			System.out.println("Terça");
		} else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5) {
			System.out.println("Quinta");
		} else if (dia == 6) {
			System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sábado");
		}
		
		System.out.println("Ótima Semana!");
		
		entrada.close();
	}
}