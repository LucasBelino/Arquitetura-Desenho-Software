package avancado;

import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.getNome().compareTo(o2.getNome());

	}

}
