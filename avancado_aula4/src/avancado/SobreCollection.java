package avancado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection {

	public static void main(String[] args) {
		
		Collection<String> colecao = extracted();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println( colecao );
		
	}

	private static ArrayList<String> extracted() {
		return new ArrayList<String>();
	}
}
