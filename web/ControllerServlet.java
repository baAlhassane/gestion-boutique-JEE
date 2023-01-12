package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

@WebServlet(name="cs", urlPatterns= {"/controller"})
public class ControllerServlet extends HttpServlet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private ImetierCatalogue metier;
  

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		metier=new MetierImpl();
		
	}
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String mc=request.getParameter("motCle");
		ProduitModel model=new ProduitModel();
		model.setMotCle(mc);
		List<Produit> prods=metier.getProduitParMocle(mc);
		model.setProduits(prods);
		request.setAttribute("model", model);
		
		request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);
		
		
		
	}


	
	
}
