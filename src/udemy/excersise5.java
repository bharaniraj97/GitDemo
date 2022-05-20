package udemy;

import org.testng.annotations.Test;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class excersise5 {
	
	@Parameters({"URL"})
	@Test
	public void method1(@Optional("OptionalParameter") String urlName) {
		System.out.println(urlName);
	}

}