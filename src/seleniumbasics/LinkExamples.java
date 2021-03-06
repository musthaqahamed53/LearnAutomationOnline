package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Wikipedia"+Keys.ENTER);
		
		driver.findElement(By.cssSelector("a[href='https://en.wikipedia.org/wiki/Main_Page']")).click();
		
		
	}

}
