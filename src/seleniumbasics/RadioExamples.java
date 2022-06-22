package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages"
				+ "/radio.html");
		
		WebElement unchecked=driver.findElement(By.
				xpath("/html/body/div/div/div[3]/"
						+ "section/div[3]/div/div"
						+ "/input[1]"));
		WebElement checked=driver.findElement(By.
				xpath("/html/body/div/div/div[3]/"
						+ "section/div[3]/div/div/"
						+ "input[2]"));
		boolean status1= unchecked.isSelected();
		boolean status2= checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20=driver.findElement(By.
				xpath("(//input[@name='age'])[1]"));
		below20.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
