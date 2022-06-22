package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher sec school");
	}
	@Test(dependsOnMethods = "highSchool")
	public void engineering() {
		System.out.println("college");
	}
	
	
	
	
	
	
	
	
	
}
