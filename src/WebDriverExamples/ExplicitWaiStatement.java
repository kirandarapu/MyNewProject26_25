package WebDriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaiStatement {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//initialize the WebDriver
		
		 driver=new ChromeDriver();
		 
		//launching the web application
		
		 driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		 Thread.sleep(3000);  //1000 milli sceonds
		 driver.manage().window().maximize(); //maximize the window
		
		
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		 
		 //create object for WebDriverwait
		 
		 
		
		 Thread.sleep(3000);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		// WebElement ele=driver.findElement(By.xpath("//div[@class='post-body entry-content']/h3/input"));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='post-body entry-content']/h3/input"))).sendKeys("selenium");
		  ///you need to click abutton  by using elementToBeClickable ==>condition
		 
		 
		
		 
		 

	}

}
