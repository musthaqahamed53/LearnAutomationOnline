package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "D:\\CTS\\geckodriver.exe");
		
	WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.google.co.in");
		
		//enter a search term
		//click the wikipedia link
		//id,name,classname,xpath,css
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Wikipedia"+Keys.ENTER);
		
		
		
		//driver.quit();
		
		
	}

}
