package EstruturasDeControle;

import java.util.Scanner;

public class Tese_SwitchComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();

		// case pode ser na mesma linha ou embaixo do outro

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		} else if (nota >= 10 || nota <= 0) {

			switch (nota) {
			case 10:
			case 9:
				conceito = "SS";

			case 8:
			case 7:
				conceito = "MS";

			case 6:
			case 5:
				conceito = "MM";

			case 4:
			case 3:
				conceito = "MI";

			case 2:
			case 1:
			case 0:
				conceito = "II";

			default:
				conceito = "Não informado";
			}

			System.out.println("Sua nota final é: " + conceito);
		}
		entrada.close();

	}

}