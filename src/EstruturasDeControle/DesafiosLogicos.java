package estruturasdecontrole;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		// parte alterável
		boolean trabalho1 = true; //TV50
		boolean trabalho2= true; //TV25
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;		
		boolean comprouTV25 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário
		boolean maisSaudável = ! comprouSorvete;
			
		System.out.println("Comprou TV50\"? "  + comprouTV50);
		System.out.println("Comprou TV25\"? "  + comprouTV25);
		System.out.println("Comprou Sorvete? "  + comprouSorvete);
		System.out.println("Mais Saudável? "  + maisSaudável);
		
	}

}
