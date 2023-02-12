package with;

public class ComputerFactory {
	
	// private static ComputerFactory instance;
	
	private ComputerFactory() { }
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		}
		else if("Serveur".equalsIgnoreCase(type)){
			return new Serveur(ram, hdd, cpu);
		}
		
		return null;
		
	}
	
	/*
	  
	  public static ComputerFactory getInstance() {
	 
		if(instance == null) {
			instance = new ComputerFactory();
		}
		
		return instance;
		
	}
	
	*/
	
}
