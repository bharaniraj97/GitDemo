package udemy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(listenerPractice.class)
public class practice1 {
	
	@DataProvider(name = "accDP")
	public Object[][] accDetails() {
		Object[][] acc = { { ("Bharani"), (758297) }, 
			           	   { ("Amutha"), (758262) }, 
			          	   { ("Anu"), (785929) } };
		return acc;
	}
	
	@DataProvider(name = "mobNUMDP")
	public Object[] mobNUMDP() {
		Object[] mob = {(8956783296L),(8956783296L),(8956783296L) };
		return mob;
	}

}
