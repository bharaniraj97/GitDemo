package udemy;

import org.testng.annotations.Test;

public class excersise7 {
	
	@Test(priority=3)
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test(priority=2)
	public void method2() {
		System.out.println("Method2");
	}
	
	@Test(priority=1)
	public void method3() {
		System.out.println("Method3");
	}

}
