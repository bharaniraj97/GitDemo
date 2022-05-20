package udemy;

import org.testng.annotations.Test;

public class excersie2 {
	
	@Test(enabled = false)
	public void method1() {
		System.out.println("How r u");
	}
	
	@Test(groups= {"smoke"})
	public void method4() {
		System.out.println("smoke from excersie 2");
	}
	
	

}
