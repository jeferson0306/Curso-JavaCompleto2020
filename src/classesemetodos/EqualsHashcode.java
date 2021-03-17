package classesemetodos;

public class EqualsHashcode {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@gmail.com";
				
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@gmail.com";
				
		System.out.println(u1 == u2); // false. pega da memoria
		System.out.println(u1.equals(u2)); //equals puro tambem pega da memoria
		System.out.println(u2.equals(u1));
		
		

	}

}
