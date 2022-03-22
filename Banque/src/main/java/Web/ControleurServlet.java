package Web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImpl;
import metier.ICreditMetier;


@WebServlet(name="cs" , urlPatterns = {"/controleur","*.do"})
public class ControleurServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private ICreditMetier metier;
	
	
	//becuse we need to instantiat the metier level only one time 
	
	
	@Override
	public void init() throws ServletException {
		metier=new CreditMetierImpl();
		
	}
	
	
	
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       request.setAttribute("creditModel", new CreditModel());
		 request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}
	 
	
   
	 
	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // read all the data writting by the user 
		 
		 
		 double montant=Double.parseDouble(request.getParameter("montant"));
         double tax=Double.parseDouble(request.getParameter("tax"));
         int duree=Integer.parseInt(request.getParameter("duree"));
         
         // stock inthe model
         
         
		CreditModel model=new CreditModel();
		model.setMontant(montant);
		model.setDuree(duree);
		model.setTax(tax);
		
		
		
		// calcul the resultat of data writting by the user 
		// and call the metier level to use the function of opration calccul
		
		double res = metier.calculerMentieliterCredit(montant, tax, duree);
		
		
		// now we will stock the rseltat calculter in themodel
		
		
		model.setMontialiter(res);
		
		
		//we will stock the model into Request object
		
		
		request.setAttribute("creditModel", model);
		
		
		// we will return to the vue.jsp
		
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
		
	
	}
}
