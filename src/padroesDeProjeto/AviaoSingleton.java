package padroesDeProjeto;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	
	// EAGER -> INITIALIZATION -> 
	
	//private static final AviaoSingleton INSTANCE = new AviaoSingleton();  // MODO EAGER
	private static AviaoSingleton INSTANCE;    // MODO LAZY
	
	// LAZY  -> INITIALIZATION -> NÃO É UM AMBIENTE THREAD SAFE
	
	private Set<String> assentosDisponiveis;
	
	// DOUBLE CHECK
	
	public static AviaoSingleton getINSTANCE() {
		if(INSTANCE == null) {
			synchronized (AviaoSingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new AviaoSingleton();
				}
			}
		}
		return INSTANCE;
	}
	/*
	public synchronized static AviaoSingleton getINSTANCE() {
		if(INSTANCE == null) {
			INSTANCE = new AviaoSingleton();
		}
		return INSTANCE;
	}
	*/
	/*
	public static AviaoSingleton getINSTANCE () {
		//if(INSTANCE == null){
		//	INSTANCE = new AviaoSingleton();
		//}
		
		return INSTANCE; 
	}
	*/

	private AviaoSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}

}
