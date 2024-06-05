package WebDriverExamples;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		//initialize the webdriver
		
		driver=new ChromeDriver();
		
		//open the application
		
		driver.get("https://www.hubilo.com/");
		
		//declare the fluent wait
		
		FluentWait wait=new FluentWait(driver);
		
		//provide the timout
		
		wait.withTimeout(Duration.ofSeconds(15));
		
		//polling intervals
		
		wait.pollingEvery(Duration.ofSeconds(5));
		
		//ignoring the exception
		
		wait.ignoring(NoSuchElementException.class);
		
		//usage
		
		WebElement gobackLogin=(WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='home-hero']/a/div11")));
		
		gobackLogin.click();
		
		
		
		
		
		//implicit wait ===>
		
		//explicit wait ==> based on the conditions 
		
		//fluent wait   ==> page loading takes more time ,,  
		
		//how to resolve synchornization issues ==> by using wait statemnts
		
		

	}

}
