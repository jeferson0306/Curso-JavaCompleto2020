package estruturasdecontrole;

public class ForIncrementoDecremento {

	public static void main(String[] args) {

		// incremento simples (++)

		for (int x = 0; x <= 10; x++) {
			System.out.println(x);
		}

		// decremento simples (--)

		for (int x = 10; x >= 0; x--) {
			System.out.println(x);
		}

		// incremento += 2 (+= 2)

		for (int x = 0; x <= 10; x+= 2) {
			System.out.println(x);
		}

		// decremento -= 3 (+= 3)

		for (int x = 10; x >= 0; x-= 3) {
			System.out.println(x);
		}

	}

}
