package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		//selenium Locators:
	/*	1.ID       
		2.Name
		3.Classname  :   By.className("AttributeValue");
		4.tagname
		5.linktext
		6.partial linktext
		7.CSS(cascading style sheet)
		8.X-path:*/

		//webdriver initialization
		
		driver=new ChromeDriver();
		
		//application open
		driver.get("https://adactinhotelapp.com/Register.php");
		//communicate with web elements
		//by uisng different types locators
		//ID  (By.id("Attribute value")
		//findElement==> identify the element,at a time identify only one element
		//sendkeys()==>enter some data into the input box
		//driver.findElement(By.id("username")).sendKeys("Kiran1122");
		
		//name ==>it's not unique ==>
		
		//syntax:By.name("Atrribute value")
		
		//driver.findElement(By.name("password")).sendKeys("Kiran123");
		
		//classname : it also not unique ==>
		//By.className("Attribute Value")
		//driver.findElement(By.className("reg_input")).sendKeys("Kiran123");
		
		//tagname  (by.tagname("tagname");
		
		
		driver.findElement(By.tagName("input")).sendKeys("kiran1122");//interaction should complete successfully
		
		driver.findElement(By.tagName("input")).sendKeys("kiran1234");//it's not possible to interact
		
//		driver.findElement(By.tagName("input")).click();
//		
//		driver.findElement(By.tagName("a")).click();
		
		
		//linktext: unique ==>front-developers
		
		//driver.findElement(By.linkText("Go back to Login page")).click();
		
		
		//partial Linktext
		
		driver.findElement(By.partialLinkText("Go back")).click();
		
		
		
		
		
		
	}

}
