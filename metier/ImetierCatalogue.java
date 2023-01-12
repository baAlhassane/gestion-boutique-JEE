package metier;

import java.util.List;

public interface ImetierCatalogue {
	
	public List<Produit> getProduitParMocle(String mc);
	public void addProduit(Produit p);
		
		
	

}
