package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendedExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		 
		driver.navigate().back();
		
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));
		String hrefName=  whereToGo.getAttribute("href");
		System.out.println("This link is going to "+hrefName);
		
		WebElement verifyBroken=driver.findElement(By.partialLinkText("Verify"));
		verifyBroken.click();
		
		String brokentitle= driver.getTitle();
	if(	brokentitle.contains("404")) {
		System.out.println("Link is Broken");
	}
		driver.navigate().back();
		
		homePageLink.click();
		
		driver.navigate().back();
		
		List<WebElement> countLinks= driver.findElements(By.tagName("a"));
		int noofLinks=countLinks.size();
		System.out.println("No of Links are "+noofLinks);
		
		//driver.close();
		
	}

}
