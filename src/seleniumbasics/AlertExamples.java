package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\CTS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages"
				+ "/Alert.html");
		//1.AlertBox
		WebElement alertBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']"
						+ "/section/div[1]/div"
						+ "/div/button"));
		alertBox.click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert1.accept();
		
		//2.ConfirmBox
		WebElement confirmBox = driver.findElement(By.
				xpath("//*[@id='contentblock']/"
						+ "section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirm1 = driver.switchTo().alert();
		Thread.sleep(1000);
		confirm1.dismiss();
		
		//3.PromptBox
		WebElement promptBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/"
						+ "section/div[3]/div/div/button"));
		promptBox.click();
		Alert prompt1= driver.switchTo().alert();
		Thread.sleep(1000);
		prompt1.sendKeys("Cognizant");
		prompt1.accept();
		
		//4.LineBreaks
		WebElement lineBreak = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[4]"
						+ "/div/div/button"));
		lineBreak.click();
		Alert line1 = driver.switchTo().alert();
		Thread.sleep(1000);
		String lineAlertText = line1.getText();
		System.out.println(lineAlertText);
		line1.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
