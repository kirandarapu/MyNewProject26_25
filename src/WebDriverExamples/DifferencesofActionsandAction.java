package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DifferencesofActionsandAction {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		//intialize the webdriver
		
		driver=new ChromeDriver();
		
		//launching the web application
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		//initialize the actions class
		
		Actions ac=new Actions(driver);
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		
		//performing the actcion
		
		
		ac.click(ele1).build().perform();
		
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Go back to Login page']"));
		
		//ac.click(ele2).perform();
		
		
		//use Action interface 
		
		Action act= ac.click(ele2).build();//creatingn the action
		
		//act.perform();
		
		driver.findElement(By.id("username")).sendKeys("kiran");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		//perform the action
		Thread.sleep(3000);
		act.perform();
		;

	}

}
