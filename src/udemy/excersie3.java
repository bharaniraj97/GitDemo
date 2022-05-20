package udemy;

import org.testng.annotations.Test;

public class excersie3 {
	
	@Test(timeOut=3000)
	public void webCarLoan() {
		System.out.println("carLoanWeb");
	}
	
	@Test
	public void mobCarLoan() {
		System.out.println("carLoanMob");
	}
	
	@Test
	public void aPICarLoan() {
		System.out.println("carLoanAPI");
	}
	
	@Test(groups= {"smoke"})
	public void method4() {
		System.out.println("smoke from excersie 3");
	}

}
