package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		int listSize=selectable.size();
		System.out.println(listSize);
		//Two ways
	//	Actions actionsPer = new  Actions(driver);
	//	actionsPer.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		
		Actions actionsPer= new Actions(driver);
		actionsPer.clickAndHold(selectable.get(0));
		actionsPer.clickAndHold(selectable.get(1));
		actionsPer.clickAndHold(selectable.get(2));
		
		actionsPer.build().perform();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
