package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {

	public List<Produit> getProduitParMocle(String mc) {
		// TODO Auto-generated method stub
		
		List<Produit> prod=new ArrayList<Produit>();
		Connection conn=SingletonConnexion.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("Select * From PRODUITS where NOM_PRODUIT LIKE ?");
			ps.setString(1, "%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Produit p =new Produit();
				p.setIdProduit(rs.getLong("ID_PRODUIT"));
				p.setNomProduit(rs.getString("NOM_PRODUIT"));
				p.setPrix(rs.getDouble("PRIX"));
				prod.add(p);
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return prod;
	}

	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	
	
}
