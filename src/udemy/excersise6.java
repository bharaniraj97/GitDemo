package udemy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class excersise6 {
	
	@Parameters({"URL","LINK"})
	@Test
	public void method1(String urlName,String link) {
		System.out.println(urlName);
		System.out.println(link);
	}
}
