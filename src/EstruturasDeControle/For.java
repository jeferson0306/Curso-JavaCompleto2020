package estruturasdecontrole;

public class For {

	public static void main(String[] args) {

		/**
		 * for (inicializa��o da vari�vel; express�o; modifica��o da vari�vel)
		 */
		for (int contador = 0; contador <= 20; contador++) {
			System.out.printf("i = %d\n", contador);

			/**
			 * Funciona, mas n�o faz muito sentido!
			 * 
			 * int x = 2; for(;x < 10;) { System.out.println("x = " + x); x++;
			 */

			/**
			 * La�o infinito
			 * 
			 * for(;;) ou for(;true;) { System.out.println("Fim!");
			 */

		}

	}

}
