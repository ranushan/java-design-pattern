package with;

public class TestClassFacade {

	public static void main(String[] args) {
		
		Facade facade = Facade.getInstance();
		
		facade.getServiceClient().login("Tata", "Tutu");
		facade.getServiceProduit().insert("Produit 2");
		facade.getServiceCommande().save("Pates", "Sale", "Confiture");
		
	}

}
