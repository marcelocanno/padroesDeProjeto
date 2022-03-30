package padroesDeProjeto;

import java.lang.reflect.Constructor;

public class AviaoSingletonTest  {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		agendarAssento("1A");
		agendarAssento("1A");
		/*          // error não solucionado
		AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
		AviaoSingleton aviaoSingleton2 = null;
		Constructor<AviaoSingleton> constructors = AviaoSingleton.class.getDeclaredConstructor();    
		for(  Constructor constructor : constructors) {
			constructor  = constructors;
			constructor.setAccessible(true);
			aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
			break;
		}
		
		System.out.println(aviaoSingleton.hashCode());
		System.out.println(aviaoSingleton2.hashCode());
	   */
	}

		

		private static void agendarAssento(String assento) {
			AviaoSingleton a = AviaoSingleton.getINSTANCE();
			System.out.println(a.bookAssento(assento));
		}
}
