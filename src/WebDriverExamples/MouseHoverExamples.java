package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		

		//intialize the webdriver
		
		driver=new ChromeDriver();
		
		//launching the web application
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//initialize the Actions class
		
		Actions ac=new Actions(driver);
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Resources']"));
		
		//create the action and perform the action
		
		ac.moveToElement(ele1).build().perform();
		

	}

}
