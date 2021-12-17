package estruturasdecontrole;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		// parte alter�vel
		boolean trabalho1 = true; //TV50
		boolean trabalho2= true; //TV25
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;		
		boolean comprouTV25 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Un�rio
		boolean maisSaudavel = ! comprouSorvete;
			
		System.out.println("Comprou TV50\"? "  + comprouTV50);
		System.out.println("Comprou TV25\"? "  + comprouTV25);
		System.out.println("Comprou Sorvete? "  + comprouSorvete);
		System.out.println("Mais Saud�vel? "  + maisSaudavel);
		
	}

}
