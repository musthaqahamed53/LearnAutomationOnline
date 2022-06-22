package seleniumbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\CTS\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/table.html");

List<WebElement> columns=driver.findElements(By.tagName("th"));
int columnCount=columns.size();
System.out.println("No of Columns "+columnCount);

List<WebElement> rows=driver.findElements(By.tagName("tr"));
int rowCount=rows.size();
System.out.println("No of Rows "+rowCount);

WebElement getPercent=driver.findElement(By.xpath("(//font[@color='black'][contains(text(),'Learn to interact with')])[1]//following::td[1]"));
String gotPercent =getPercent.getText();
System.out.println("The Progess value is "+gotPercent);

List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));

List<Integer> numberList=new ArrayList<Integer>();

for (WebElement webElement : allProgress) 
{
	String individualValue= webElement.getText().replace("%",""); //replace -  replaces the string value to given value
	numberList.add(Integer.parseInt(individualValue)); //parseInt changes string value to integer
}
System.out.println("Final List"+numberList);

int smallValue=Collections.min(numberList); //collecions.min - check for min value in the given collection ,, ie. the list numberList
System.out.println(smallValue);

String newString= Integer.toString(smallValue);

String finalXpath="//td[normalize-space()='"+ newString +"%']//following::td[1]//input[1]";

System.out.println(finalXpath);

WebElement check=driver.findElement(By.xpath(finalXpath));
check.click();












	}

}
