package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
		
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
}
