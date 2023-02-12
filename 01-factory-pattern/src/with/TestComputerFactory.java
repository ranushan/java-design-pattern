package with;

public class TestComputerFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 Ghz");
		Computer serveur = ComputerFactory.getComputer("Serveur", "16 GB", "1 TB", "2.9 Ghz");
		System.out.println("Factory PC Config:: " + pc);
		System.out.println("Factory Serveur Config:: " + serveur);
		
	}

}
