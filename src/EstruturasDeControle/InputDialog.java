package estruturasdecontrole;

import javax.swing.JOptionPane;

public class InputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.printf("Soma �: %.2f\n", soma);
		double media = soma / 2;
		System.out.printf("M�dia �: %.2f\n", media);
		
		if (media < 7.0) {
			System.out.println("Reprovado");
		} if (media > 7.0) {
			System.out.println("Aprovado");
		}
		
		
				
		
		
		
	}

}
