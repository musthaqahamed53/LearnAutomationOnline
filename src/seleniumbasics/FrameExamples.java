package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0); //switch control to the first iFrame
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		// get text from the clicked button
		String text1 = button1.getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent(); //switch to main content
		
		driver.switchTo().frame(1);//switch control to next frame
		driver.switchTo().frame("frame2"); //switch control to next nested frame by id
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent(); //switch to main content
		
		//count no of frames by find the number of times iframe tag is repeated
		List<WebElement>  Count1 =driver.findElements(By.tagName("iframe"));
		int noofframes = Count1.size();
		System.out.println("No of frames is "+noofframes); 
		
		
		
		
		
		
		
		
		
		
	}

}
