package estruturasdecontrole;

public class For {

	public static void main(String[] args) {

		/**
		 * for (inicialização da variável; expressão; modificação da variável)
		 */
		for (int contador = 0; contador <= 20; contador++) {
			System.out.printf("i = %d\n", contador);

			/**
			 * Funciona, mas não faz muito sentido!
			 * 
			 * int x = 2; for(;x < 10;) { System.out.println("x = " + x); x++;
			 */

			/**
			 * Laço infinito
			 * 
			 * for(;;) ou for(;true;) { System.out.println("Fim!");
			 */

		}

	}

}
