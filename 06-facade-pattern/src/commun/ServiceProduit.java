package commun;

public interface ServiceProduit {
	
	void insert(String produit);
	boolean delete(String produit);
	String update(String produit);
	String get(String produit);
	
}
