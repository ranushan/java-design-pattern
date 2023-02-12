package with;

public class TestSingletonFactory {
	
	public static void main(String[] args) {
		
		ComputerSingletonFactory factory = ComputerSingletonFactory.getInstance();
		
		Computer pc = factory.getComputer("PC", "4 GB", "1 TB", "3.0 Ghz");
		Computer serveur = factory.getComputer("Serveur", "16 GB", "1 TB", "2.9 Ghz");
		
		System.out.println("Singleton Factory PC Config:: " + pc);
		System.out.println("Singleton Factory Serveur Config:: " + serveur);
		
	}

}
