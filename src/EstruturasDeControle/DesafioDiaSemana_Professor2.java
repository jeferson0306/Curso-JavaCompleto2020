package estruturasdecontrole;
import java.util.Scanner;

public class DesafioDiaSemana_Professor2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia: ");
		
		String dia = entrada.next();
		
		if ("domingo".equals(dia.toLowerCase())) {
			System.out.println(1);
		} else if ("segunda".equals(dia.toLowerCase())) {
			System.out.println(2);
		} else if ("terça".equals(dia.toLowerCase())) {
			System.out.println(3);
		} else if ("quarta".equals(dia.toLowerCase())) {
			System.out.println(4);
		} else if ("quinta".equals(dia.toLowerCase())) {
			System.out.println(5);
		} else if ("sexta".equals(dia.toLowerCase())) {
			System.out.println(6);
		} else if ("sábado".equals(dia.toLowerCase())) {
			System.out.println(7);
		} else {
			System.out.println("Dia Inválido!");
		}
		
		entrada.close();
	}
}