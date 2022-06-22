package seleniumbasics;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open site
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1.get xy value
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point location = getPositionButton.getLocation();
		int xvalue = location.getX();
		int yvalye = location.getY();
		System.out.println("X value is "+ xvalue+"\nY value is "+ yvalye);
		
		//2. get button color
		WebElement findColor =  driver.findElement(By.id("color"));
		String colorFinded = findColor.getCssValue("background-color");
		System.out.println(colorFinded);
		
		//3. get button size
		WebElement getButtonSize =  driver.findElement(By.id("size"));
		int buttonheight = getButtonSize.getSize().getHeight();
		int buttonwidth = getButtonSize.getSize().getWidth();
		System.out.println("Height is "+ buttonheight+"\nWidth is "+buttonwidth);
		
		//4. go to home page button
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
