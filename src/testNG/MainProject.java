package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainProject {
	@Test
	public void callBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://be.cognizant.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("2157925@cognizant.com");
		
		driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'i0118\']")).sendKeys("Kingdom@420");
		driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).click();
	}
	
}
