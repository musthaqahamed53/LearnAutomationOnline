package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//Select the languages that you know?
		WebElement selectJava=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		WebElement selectC=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		
		selectJava.click();
		selectC.click();
		
		//Confirm Selenium is checked
		WebElement CheckSelenium=driver.findElement
				(By.xpath("//*[@id=\'contentblock\']"
						+ "/section/div[2]/input"));
		boolean seleniumEnabled= CheckSelenium.
				isEnabled();
		System.out.println("SELENIUM ENEBLED? "
		+seleniumEnabled);
		
		//DeSelect only checked
		WebElement firstElement=driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/"
						+ "section/div[3]/input[1]"));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		WebElement secondElement=driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/"
						+ "section/div[3]/input[2]"));
		if(secondElement.isSelected()) {
			secondElement.click();
		}
		
		//Select all below checkboxes
	
		WebElement option1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		WebElement option2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		WebElement option3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		WebElement option4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		WebElement option5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		WebElement option6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		
		option1.click();
		option2.click();		
		option3.click();
		option4.click();		
		option5.click();		
		option6.click();		
		
		
	}

}
