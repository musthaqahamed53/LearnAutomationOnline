package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {
	
	//Aim: Open chrome and go to
		//1. google.co.in
		//2. bing.com
		//3. yahoo.com
		//4. close the browser	
	
	WebDriver driver; //delclare the driver in class level
	long startTime= System.currentTimeMillis();
	long endTime;
	
	
	@BeforeSuite  //suite means collection of testcase
	public void launchBrowser() { //to open browser only once
		startTime= System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void openGoogle() 
	{		
		driver.get("https://www.google.co.in");
	}
	@Test
	public void openBing() 
	{		
		driver.get("https://www.bing.com");	
	}
	@Test
	public void openYahoo() 
	{		
		driver.get("https://www.yahoo.com");	
	}
	@AfterSuite
	public void closeBrowser() 
	{ //close broswser
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken: "+totalTime);
	}
	
	
	
	
	
	
	
}
