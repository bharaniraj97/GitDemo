package udemy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class excersise4 {
	
	@Test
	public void webBikeLoan() {
		System.out.println("bikeLoanWeb");
	}
	
	@Test
	public void mobBikeLoan() {
		System.out.println("bikeLoanMob");
	}
	
	@Test
	public void aPIBikeLoan() {
		System.out.println("bikeLoanAPI");
	}
	
	@Test(groups= {"smoke"})
	public void method4() {
		System.out.println("smoke from excersie 4");
	}
	
	
	

}
