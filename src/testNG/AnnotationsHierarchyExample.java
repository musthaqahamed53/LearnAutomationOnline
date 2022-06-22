package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
  @Test
  public void test() {
	  System.out.println("I'm Test");
  }
  @Test
  public void test2() {
	  System.out.println("I'm Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm after suite");
  }

}

/*
 * Output [RemoteTestNG] detected TestNG version 7.4.0 
 * I'm before suite 
 * I'm before Test 
 * I'm before class 
 * I'm before method 
 * I'm Test 
 * I'm After method 
 * I'm before method 
 * I'm Test2 
 * I'm After method 
 * I'm after class 
 * I'm after Test
 * PASSED: test PASSED: test2
 * 
 * =============================================== 
 * 		Default test Tests run: 2,
 * 		Failures: 0, Skips: 0 
 * ===============================================
 * 
 * I'm after suite
 * 
 * =============================================== 
 * Default suite Total tests
 * run: 2, Passes: 2, Failures: 0, Skips: 0
 * ===============================================
 */