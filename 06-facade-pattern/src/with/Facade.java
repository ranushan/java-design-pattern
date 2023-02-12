package with;

import commun.ServiceClient;
import commun.ServiceClientImpl;
import commun.ServiceCommande;
import commun.ServiceCommandeImpl;
import commun.ServiceProduit;
import commun.ServiceProduitImpl;

public class Facade {
	
	private static Facade facade = null;
	
	private ServiceClient serviceClient;
	private ServiceProduit serviceProduit;
	private ServiceCommande serviceCommande;
	
	private Facade() {
		serviceClient = new ServiceClientImpl();
		serviceProduit = new ServiceProduitImpl();
		serviceCommande = new ServiceCommandeImpl();
	}
	
	public static Facade getInstance() {
		if(facade == null) {
			facade = new Facade();
		}
		return facade;
	}

	public ServiceClient getServiceClient() {
		return serviceClient;
	}

	public ServiceProduit getServiceProduit() {
		return serviceProduit;
	}

	public ServiceCommande getServiceCommande() {
		return serviceCommande;
	}

}
