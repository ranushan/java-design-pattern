package with;

import inter.ISingleton;

public class EagerSingleton implements ISingleton{
	
	private static final EagerSingleton instance = new EagerSingleton();
	
	// Le constructeur en priv� pour interdire l'instanciation
	// de classe de l'ext�rieur
	
	private EagerSingleton() { }
	
	public static EagerSingleton getInstance() {
		return instance;
	}

	@Override
	public String getHello() {
		return "Je suis dans le EagerSingleton";
	}
	
	
}
