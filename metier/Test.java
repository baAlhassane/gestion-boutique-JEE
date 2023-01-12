package metier;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ImetierCatalogue
		MetierImpl metier=new MetierImpl();
		List<Produit>prods=metier.getProduitParMocle("HP");
		
		for(Produit p: prods) {
			
			System.out.println(p.toString());
			System.out.print(p.getNomProduit());
		}
		
		
		
	}

}
