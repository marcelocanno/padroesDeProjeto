package padroesDeProjeto;

public class MoedaFactory {
	
	public static Moeda criarMoeda(Pais pais) {
		
		if(pais.equals(pais.BRASIL)) {
			return new Real();
		}else if(pais.equals(pais.EUA)) {
			return new USDolar();
		}
		throw new IllegalArgumentException("Não existe esse pais");
	}

}
