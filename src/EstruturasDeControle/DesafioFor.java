package estruturasdecontrole;
public class DesafioFor {

	public static void main(String[] args) {

		//for de int
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		//for de string
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}