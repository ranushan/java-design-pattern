package with;

import inter.ISingleton;

public class LazySingleton implements ISingleton{
	
	private static LazySingleton instance;
	
	private LazySingleton() { }
	
	public static LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	@Override
	public String getHello() {
		return "Je suis dans le LazySingleton";
	}

}
