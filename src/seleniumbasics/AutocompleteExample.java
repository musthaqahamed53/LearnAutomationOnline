package seleniumbasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(1000); //Explicit wait or implicit wait
		
		List<WebElement> optionsList= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		System.out.println(optionsList.size());
		
		//check all the available 4 options to look for "Web Services" 
		
		for (WebElement storedElement : optionsList) 
		{
			if(storedElement.getText().equals("Web Services"))
			{
				System.out.println("Selectable: "+storedElement.getText());
				storedElement.click();
				//System.out.println("Selectable: "+storedElement.getText());
				break;
			}
			/*It's always better to add what if not part (else) in the code.  
			Because the code should be capable of handling not only the positive 
			scenarios also the unexpected one*/
			else {
				System.out.println("Else PART");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
