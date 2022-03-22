package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditMetierImplTest {

	
	private ICreditMetier metier;
	
	@Before
	public void setUp()throws Exception{
		
		metier=new CreditMetierImpl();
	}
	
	
	@Test
	public void testCalculerMentieliterCredit() {
		double capital=200000;
		int duree=240;
		double tax=4.5;
		double resultatAttendu=1265.2987;
		double resCalculer=metier.calculerMentieliterCredit(capital, tax, duree);
		assertEquals(resultatAttendu, resCalculer, 0.0001);
		
		
	}

}
