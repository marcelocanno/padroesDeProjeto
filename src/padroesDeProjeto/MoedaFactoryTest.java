package padroesDeProjeto;

public class MoedaFactoryTest {

	public static void main(String[] args) {
		
		Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
		Moeda moeda1 = MoedaFactory.criarMoeda(Pais.EUA);
		
		
		System.out.println(moeda.getSimbolo());
		System.out.println(moeda1.getSimbolo());
		
		
	}

}
