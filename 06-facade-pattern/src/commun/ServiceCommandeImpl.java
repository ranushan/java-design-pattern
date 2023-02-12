package commun;

public class ServiceCommandeImpl implements ServiceCommande{

	@Override
	public void save(String... produits) {
		System.out.println("Produit : ");
		for(String s : produits) {
			System.out.println(" -" + s + " \n");
		}
		
	}
	
}
