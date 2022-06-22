package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("xyz@gmail.com");
		
		WebElement appendBox = driver.findElement(By.xpath("//input[@value='Append ']"));
		appendBox.sendKeys("text"+Keys.TAB);
		
		WebElement getBox = driver.findElement(By.name("username"));
		String value = getBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox =driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearBox.clear();
		
		
		WebElement disabledBox = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabledCheck = disabledBox.isEnabled();
		System.out.println(enabledCheck);
		driver.quit();
	}

}
