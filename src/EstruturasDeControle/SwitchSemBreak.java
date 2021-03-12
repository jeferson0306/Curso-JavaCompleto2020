package estruturasdecontrole;

public class SwitchSemBreak {

	public static void main(String[] args) {

		int idade = 5;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar.");
		case 2:
			System.out.println("Sabe andar.");
		case 1:
			System.out.println("Sabe caminhar.");
		case 0:
			System.out.println("Sabe dormir.");
		default: 
			System.out.println("Não sabe nada.");
		}

		}

	}