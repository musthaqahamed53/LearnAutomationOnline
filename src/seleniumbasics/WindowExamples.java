package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExamples {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String oldWindow = driver.getWindowHandle(); //precautionarily taken this window thus we can return to this window when needed
		
		
		//open homepage
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		//switch control to go for new window or child window
		Set<String> handles= driver.getWindowHandles();
		//to iterate and read all the windows
		for (String newWindows : handles) 
		{
			driver.switchTo().window(newWindows); //to move to the newly onened window
		}
		
		WebElement editBox= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editBox.click();
		driver.close();
		
		//switch control to oldWindow
		driver.switchTo().window(oldWindow);
		
		//Find numner of opened windows
		WebElement multipleWindows = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		multipleWindows.click();
		
		int noofWindows = driver.getWindowHandles().size();
		System.out.println("No of open windows "+noofWindows);
		
		//close all new windows except parent
		
		WebElement donotClose=driver.findElement(By.xpath("//div[@id='contentblock']//div[3]//div[1]//div[1]//button[1]"));
		donotClose.click();
	
		Set<String> newWindowHandles= driver.getWindowHandles();
	   
		for (String allotherwindows : newWindowHandles) 
		{
			if(!allotherwindows.equals(oldWindow)) 
			{
				driver.switchTo().window(allotherwindows);
				driver.close();
			}
		}
		
		driver.quit();
		
		
		
		
		
	}

}
