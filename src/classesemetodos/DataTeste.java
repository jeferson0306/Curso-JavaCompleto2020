package classesemetodos;

public class DataTeste {

	public static void main(String[] args) {

		// data inicial do calendario
		Data d1 = new Data();
		
		// se colocar isso, o padrao sera esta data, se retirar sera a que ta setada no data.java
		d1.ano = 1994;
		d1.mes = 06;
		d1.dia = 03;

		// esta data seria a segunda data setada
		var d2 = new Data(31, 12, 2020);

		String dataFormata1 = d1.obterDataFormata();

		System.out.println(dataFormata1);
		System.out.println(d2.obterDataFormata());

		d1.imprimirDataFormata();
		d2.imprimirDataFormata();

	}
}
