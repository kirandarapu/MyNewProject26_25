package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators_002 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//intialize the browser
		driver=new ChromeDriver();
		
		//open the application
		driver.get("https://adactinhotelapp.com/");
		
		//identify the element
		//1.Tagname and ID
//		driver.findElement(By.cssSelector("#username")).sendKeys("Kiran234");
//
//		driver.findElement(By.cssSelector("input#password")).sendKeys("987654321");
//	
	   //Tagname and Class  2nd approach
		
		//driver.findElement(By.cssSelector(".login_input")).sendKeys("Kiran567");
	 // driver.findElement(By.cssSelector("input.login_input")).sendKeys("987654321");
	
	  //3rd approach  tagname and attribute
	  
	  //driver.findElement(By.cssSelector("[type=text]")).sendKeys("3456789");
	 // driver.findElement(By.cssSelector("input[type=password]")).sendKeys("kiran234");
	
	  //tagname ,class and aTTRIBUTE  ==>4th approach
	  
	  driver.findElement(By.cssSelector("input.login_input[type=password]")).sendKeys("789045");
	  
	  
	  driver.findElement(By.cssSelector("a[target=_blank]")).click();
	  
	  Thread.sleep(1000); //checked exception
	}

}
