package estruturasdecontrole;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 operados, a situação(media >= 7.0), quando for verdadeiro(aprovado) e quando for falso(em recuperação).
		double media = 7.1;
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
		System.out.println("O aluno está " + resultadoFinal + ", nota final: " + media);
		
		
		
	}

}
