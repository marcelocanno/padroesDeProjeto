package padroesDeProjeto;

import java.util.HashSet;
import java.util.Set;

public class Aviao {
	
	private Set<String> assentosDisponiveis;
	
	public Aviao() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1A");
		
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
	

}
