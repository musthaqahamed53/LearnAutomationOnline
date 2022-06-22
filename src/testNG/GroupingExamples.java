package testNG;

import org.testng.annotations.Test;

public class GroupingExamples {

	/* Scenario: A Big basket is having different kinds of monbiles
	 * Let us say that there are Apple phones, moto g, vivo and lenovo.
	 * I want to run test only for vivo and moto phones. write a program for that.
	 */
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");
	}
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("Moto testing");
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("Moto testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("Vivo testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo testing");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo1() {
		System.out.println("Lenovo testing");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo2() {
		System.out.println("Lenovo testing");
	}
}
