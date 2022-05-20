package udemy;

import org.testng.annotations.Test;

public class practice2 {
	
	@Test(dataProvider="accDP",dataProviderClass=practice1.class)
	public void accMethod(String name, int accNum) {
		System.out.println(name + "=" + accNum);
	}
	@Test(dataProvider="mobNUMDP",dataProviderClass=practice1.class)
	public void mobMethod(long mobNum) {
		System.out.println(mobNum);
	}

}
