package WebDriverExamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitStatements {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//initialize the WebDriver
		
		 driver=new ChromeDriver();
		 
		//launching the web application
		 //10 ==> 4 seconds whole page loaded  ==>6 seconds
		 driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //==> selenium3.0
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// ==>selenium 4.0
		 
		//identify the element
		 //3 seconds ==>7 seconds
		 driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		 
		 driver.findElement(By.xpath("//div[@class='post-body entry-content']/h3/input")).sendKeys("Selenium");
		 
	    
		 
		 

	}

}
