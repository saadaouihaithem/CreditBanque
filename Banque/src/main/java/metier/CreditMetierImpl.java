package metier;

public class CreditMetierImpl implements ICreditMetier {

	@Override
	public double calculerMentieliterCredit(double capital, double tax, int duree) {
		
		// implement the logic of this method to calcul the tax 
		double t=tax/100;
		double t1=capital*t/12;
		double t2=1-Math.pow(1+t/12,-duree);
		
		return t1/t2;
	}

}
