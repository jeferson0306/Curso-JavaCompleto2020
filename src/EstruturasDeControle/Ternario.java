package estruturasdecontrole;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 operados, a situa��o(media >= 7.0), quando for verdadeiro(aprovado) e quando for falso(em recupera��o).
		double media = 7.1;
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recupera��o";
		System.out.println("O aluno est� " + resultadoFinal + ", nota final: " + media);
		
		
		
	}

}
