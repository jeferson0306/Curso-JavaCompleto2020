package colecoes;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>(); // não precisa adicionar, mas pode.
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);			
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(150);
		nums.add(400);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
	}

}
