package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExamples {

	String name="Sheik";
	@Test
	public void checkEqual() {
		
		/*if(name.equals("Agni")) {
			System.out.println("Name is equal");
		}
		else {
			System.out.println("Name is not equal");
		}*/
	
		Assert.assertTrue(true, name);
		
	
	}
			
		
}
