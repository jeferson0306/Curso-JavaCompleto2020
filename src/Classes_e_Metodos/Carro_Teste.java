package Classes_e_Metodos;

public class Carro_Teste {

	public static void main(String[] args) {


		Carro c1  = new Carro("couro", "metálica");
		
		c1.portas = "de ferro";
		c1.volante = "de plastico";
		
		System.out.println(c1.banco);
		System.out.println(c1.volante);
	

		System.out.printf("\nO cliente solicitou o veículo com banco de %s e volante de %s", c1.banco, c1.volante);
	}

}
