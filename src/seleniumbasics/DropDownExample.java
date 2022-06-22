package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\CTS\\\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driv.findElement(By.id("dropdown1"));
	
		Select select = new Select(dropDown1);
		select.selectByIndex(3);
		
		WebElement dropDown2 = driv.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropDown2);
		select2.selectByVisibleText("Selenium");
		
		
		WebElement dropDown3 = driv.findElement(By.xpath("//*[@id=\"dropdown3\"]"));
		Select select3 = new Select(dropDown3);
		select3.selectByValue("2");
		
		
		WebElement dropDown4 = driv.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/select"));
		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of elements "+size);
		
		WebElement dropDown5 = driv.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropDown5.sendKeys("Loadrunner");
		
		WebElement multiSelect = driv.findElement(By.
				xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[6]/select[1]"));
		Select multiSelectBox = new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
