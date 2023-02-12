package with;

public class Test {

	public static void main(String[] args) {
		
		FichierContext fichier = new FichierContext(new FichierOpen());
		
		fichier.lecture();
		
		fichier = new FichierContext(new FichierClose());
		
		fichier.lecture();
		
		fichier = new FichierContext(new FichierUse());
		
		fichier.lecture();
			
	}
	

}
