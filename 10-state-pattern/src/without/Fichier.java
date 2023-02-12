package without;

public class Fichier {
	
	public final static int OPEN = 0;
	public final static int CLOSE = 1;
	
	public final static int USE = 2;
	
	private int etat = 1;

	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	public void lecture() {
		if(etat == OPEN) {
			System.out.println("Lecture du fichier ...");
		}
		else if(etat == CLOSE) {
			System.out.println("Lecture du fichier impossible ...");
		}
	}
	
}
