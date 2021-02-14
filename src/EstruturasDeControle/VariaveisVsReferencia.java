package EstruturasDeControle;

public class VariaveisVsReferencia {

	public static void main(String[] args) {


		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b); // a + b = soma // a + " " + b (simbolo de concatenação de string) 

		// Criar objeto
		
		Data d1 = new Data (01, 01, 1930);
	}

}
