package test;

import with.EagerSingleton;
import with.LazySingleton;

public class ClassTest {

	public static void main(String[] args) {
		
		EagerSingleton eager = EagerSingleton.getInstance();
		System.out.println("Eager... " + eager.getHello());
		
		System.out.println("Lazy... " + LazySingleton.getInstance().getHello());
		
	}

}
