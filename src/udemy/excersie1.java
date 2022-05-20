package udemy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class excersie1 {

	@Test(dependsOnMethods={"method2","method4"})
	public void method1() {
		System.out.println("Hi");
	}
	
	@Test
	public void method2() {
		System.out.println("Hello");
	}
	
	@Test(groups= {"smoke"})
	public void method4() {
		System.out.println("smoke from excersie 1");
	}
	
	@BeforeSuite
	public void method3() {
		System.out.println("Test is started");
	}
	
	@AfterSuite
	public void method() {
		System.out.println("Test Completed");
	}

}
