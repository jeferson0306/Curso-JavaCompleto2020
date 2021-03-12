package classesemetodos;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	Data(int diaInicial) {
		dia = diaInicial;
	}

	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;

	}
	
	String obterDataFormata() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
		void imprimirDataFormata() {
			System.out.println(obterDataFormata());
		}
}