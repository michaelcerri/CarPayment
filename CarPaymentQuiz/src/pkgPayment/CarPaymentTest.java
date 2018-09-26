package pkgPayment;

//junit imports
import static org.junit.Assert.*;

import org.junit.Test;


public class CarPaymentTest {
	//test monthly
	@Test
	public void monthlyCarPaymentTest(){
		CarPayment cp=new CarPayment(35000,0,60,.10);
		assertEquals(743.65,cp.monthlyCarPayment(),.01); //expected, actual, allowed difference (double values)	
	}
	//test interest cost
	@Test
	public void interestCostTest(){
		CarPayment cp=new CarPayment(35000,0,60,.10);
		assertEquals(9618.79,cp.interestCost(),.01);	
	}

}