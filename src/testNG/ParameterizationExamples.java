package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExamples {
	
	@Test 
	@Parameters("NameSheik")
	public void printname(String name) {
		System.out.println("Name is "+ name);
	}
	
	
	
	
	
}
