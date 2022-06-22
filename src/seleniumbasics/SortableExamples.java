package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/sortable.html");

//ul[@id='sortable']/li

List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

WebElement fromElement=elements.get(5);
WebElement toElement=elements.get(0);

Actions dragDrop=new Actions(driver);

dragDrop.dragAndDrop(fromElement, toElement).build().perform();


//dragDrop.clickAndHold(fromElement);
//dragDrop.moveToElement(toElement);
//dragDrop.release(toElement);
//dragDrop.build().perform();

















	}

}
