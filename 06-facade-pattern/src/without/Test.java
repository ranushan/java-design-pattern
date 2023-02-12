package without;

import commun.ServiceClient;
import commun.ServiceClientImpl;
import commun.ServiceCommande;
import commun.ServiceCommandeImpl;
import commun.ServiceProduit;
import commun.ServiceProduitImpl;

public class Test {

	public static void main(String[] args) {
		ServiceClient serviceClient = new ServiceClientImpl();
		ServiceProduit serviceProduit = new ServiceProduitImpl();
		ServiceCommande serviceCommande = new ServiceCommandeImpl();
		
		serviceClient.login("Toto", "Titi");
		serviceProduit.insert("Produit 1");
		serviceCommande.save("Riz", "Sucre", "Beurre");
	}

}
