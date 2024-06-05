package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		//initlize the webdriver
		driver=new ChromeDriver();
		
		//launching the web application
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(3000); //milli seconds
		//findelemnt()
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("Admin");
		Thread.sleep(1000);
		ele.clear();
		//isDisplayed method
		System.out.println(ele.isDisplayed());//true
		
		//enabled
		System.out.println(ele.isEnabled());
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		//clear
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		password.sendKeys("admin123");
		
		//click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//clear
		
		//findElements
		
		List<WebElement>all=driver.findElements(By.tagName("a1"));
		System.out.println(all);
		
		

	}

}
