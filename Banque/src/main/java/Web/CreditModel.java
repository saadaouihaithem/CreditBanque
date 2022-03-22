package Web;

public class CreditModel {
	
	private double montant;
	private double tax;
	private int duree;
	private double montialiter;
	public CreditModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CreditModel(double montant, double tax, int duree, double montialiter) {
		super();
		this.montant = montant;
		this.tax = tax;
		this.duree = duree;
		this.montialiter = montialiter;
	}
	
	
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getMontialiter() {
		return montialiter;
	}
	public void setMontialiter(double montialiter) {
		this.montialiter = montialiter;
	}
	
	
	

}
