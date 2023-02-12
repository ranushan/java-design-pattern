package with;

public class ComputerSingletonFactory {
	
	private static ComputerSingletonFactory instance = null;
	
	private ComputerSingletonFactory() { }
	
	public static ComputerSingletonFactory getInstance() {
		
		if(instance == null) {
			instance = new ComputerSingletonFactory();
		}
		
		return instance;
		
	}
	
	public Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		}
		else if("Serveur".equalsIgnoreCase(type)){
			return new Serveur(ram, hdd, cpu);
		}
		
		return null;
		
	}
	

}
