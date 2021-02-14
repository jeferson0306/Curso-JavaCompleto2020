package EstruturasDeControle;

public class Println_Printf {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		s = s.toUpperCase();
		s = s.toLowerCase();
		
		System.out.println();
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = ("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		System.out.println(maisUmaFrase);
		
		System.out.println();
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("O senhor  %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario);
		String frase = String.format("O senhor  %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println();
		
		System.out.println("Frase qualquer".contains("quer"));
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".contains("oi"));
		
		System.out.println();
		
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".indexOf(" "));
		System.out.println("Frase qualquer".indexOf("e"));
		
		System.out.println();
		
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(8));
		System.out.println("Frase qualquer".substring(3));
		System.out.println("Frase qualquer".substring(3, 9));
		
		
	}
}