package EstruturasDeControle;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Bom");
		System.out.print(" dia!");
		System.out.println(" Não é?");
		System.out.println("Agora pulou");
		
		System.out.printf("Megasena da virada: %d, %d, %d, %d, %d e %d.\n\n", 1, 10, 20, 30, 40, 50);
		
		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("O profissional %s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
		
		}

}
