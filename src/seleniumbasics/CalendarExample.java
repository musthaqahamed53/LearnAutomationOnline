package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Calendar.html");

WebElement datePick=driver.findElement(By.id("datepicker"));
//datePick.sendKeys("07/10/2022"+Keys.ENTER);


datePick.click();
Thread.sleep(1000);
WebElement nextButton=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
nextButton.click();

WebElement clickDate=driver.findElement(By.xpath("//a[normalize-space()='10']"));
clickDate.click();
	
	}

}
