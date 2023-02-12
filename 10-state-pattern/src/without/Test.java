package without;

public class Test {

	public static void main(String[] args) {
		
		Fichier fichier = new Fichier();
		
		fichier.setEtat(Fichier.OPEN);
		
		fichier.lecture();
		
		fichier.setEtat(Fichier.CLOSE);
		
		fichier.lecture();
		
	}

}
