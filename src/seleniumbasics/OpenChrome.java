package seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChrome {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		
		//get details from properties file
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties= new Properties();
		properties.load(fileInputStream);
		
		String browserName = properties.getProperty("browser");
		
		String driverLocationName = properties.getProperty("driverLocation");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocationName);
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocationName);
			driver = new FirefoxDriver();
		}
		
		 
		/*
		 * System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		
		
		
	}

}
