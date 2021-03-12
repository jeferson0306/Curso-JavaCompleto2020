package estruturasdecontrole;

import java.util.Scanner;

public class SwitchComBreak2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();

		// case pode ser na mesma linha ou embaixo do outro
		switch (nota) {
		case 10:
		case 9:
			conceito = "SS";
			break;
		case 8:
		case 7:
			conceito = "MS";
			break;
		case 6:
		case 5:
			conceito = "MM";
			break;
		case 4:
		case 3:
			conceito = "MI";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "II";
			break;
		default:
			conceito = "Não informado";
		}

		System.out.println("Sua nota final é: " + conceito);
		
		entrada.close();

	}

}