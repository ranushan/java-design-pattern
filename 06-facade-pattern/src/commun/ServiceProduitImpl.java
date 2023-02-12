package commun;

public class ServiceProduitImpl implements ServiceProduit{

	@Override
	public void insert(String produit) {
		System.out.println("Produit saved : " + produit);
	}

	@Override
	public boolean delete(String produit) {
		System.out.println("Produit deleted : " + produit);
		return true;
	}

	@Override
	public String update(String produit) {
		System.out.println("Produit updated : " + produit);
		return produit;
	}

	@Override
	public String get(String produit) {
		System.out.println("Produit : " + produit);
		return produit;
	}
	
}
