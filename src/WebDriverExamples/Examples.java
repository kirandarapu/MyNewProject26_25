package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//Tag and ID
		//driver.findElement(By.cssSelector("#username")).sendKeys("Kiran");
		
		//driver.findElement(By.cssSelector("input#username")).sendKeys("Kiran123");
	//Tag and class
		driver.findElement(By.cssSelector(".login_input")).sendKeys("1234");
	
	}

}
