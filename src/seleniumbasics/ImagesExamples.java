package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
				
		WebElement firstImg = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		firstImg.click();
		driver.navigate().back();
		WebElement SecondImg = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		//verify if the SecondImg -> "naturalWidth" = 0 
		// so that we can confirm that the image is broken
		
		if(SecondImg.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Img is broken");
		}
		else {
			System.out.println("Img is not broken");
		}
		
	
		
		
		
		
	}

}
