package WebDriverExamples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		//initialize the webdriver
		driver=new ChromeDriver();
		
		//launching the web application
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.manage().window().maximize();
		
		//perform the login functionality
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(15000);

//		Alert a=driver.switchTo().alert();
//		a.accept();
//		
	  WebElement ele1= driver.findElement(By.xpath("//button[@class='btn-close']"));
	
	    if(ele1.isDisplayed()) {
	    	ele1.click();
	    }
	    
	    driver.findElement(By.xpath("//li[@id='menu-customer']/a")).click();
	    
	    driver.findElement(By.xpath("//ul[@id='collapse-5']/li/a")).click();
	
	
	    //identify the no of pages in a pagination table
	    
	   WebElement ele2= driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 19096 (1910 Pages))"));
	
	    String text=ele2.getText();
	    System.out.println(text); //Showing 1 to 10 of 19087 (1909 Pages)==>String value
	    
	    //convert string into int
	    
	    int Pages=Integer.parseInt(text.substring(text.indexOf("of")+1),text.indexOf("(")-1);//1909
	    
	    System.out.println(Pages);
	    
	    
	
	}

}
