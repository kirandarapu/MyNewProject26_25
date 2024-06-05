package WebDriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		//initialize the webdriver
		
		driver=new ChromeDriver();
		
		//open the application
		
		//implicit wait statement
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://adactinhotelapp.com/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//WebDriverWait initialization/declaration
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//usage
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New User Register Here11']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).sendKeys("Kiran");
		//visibilityofAllElements(
		//alertIsPresent
		//FrameIsPresent
		//

	}

}
