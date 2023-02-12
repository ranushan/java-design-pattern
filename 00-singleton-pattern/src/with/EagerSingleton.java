package with;

import inter.ISingleton;

public class EagerSingleton implements ISingleton{
	
	private static final EagerSingleton instance = new EagerSingleton();
	
	// Le constructeur en privé pour interdire l'instanciation
	// de classe de l'extérieur
	
	private EagerSingleton() { }
	
	public static EagerSingleton getInstance() {
		return instance;
	}

	@Override
	public String getHello() {
		return "Je suis dans le EagerSingleton";
	}
	
	
}
