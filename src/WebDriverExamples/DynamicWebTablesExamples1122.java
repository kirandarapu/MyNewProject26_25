package WebDriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablesExamples1122 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	     driver.manage().window().maximize();
	     
	     driver.findElement(By.name("username")).sendKeys("Admin");
	     
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     driver.findElement(By.xpath("//span[text()='PIM']")).click();
	     
	     //identify the number of pages available in the webtable
	     
	     List<WebElement>pages=driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']/li/button"));
	     
	     System.out.println(pages.size());
	     
	     for(int i=0;i<pages.size();i++) {
	    	 
	    	 try {
	    	 //identify the no of rows available on the web table
	    	 int noofrows=driver.findElements(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div")).size();
	          System.out.println(noofrows);
	          
	          //fetch the data from the web table
	          
	          for(int r=1;r<=noofrows;r++) {
	        	  
	        	  String data=driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div["+r+"]")).getText();
	         System.out.print(data);
	          
	          }
	          System.out.println();
	    	 }catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
	          
	          pages.get(i).click();
	          
	     }
	     
	     
	    
	
	
	}

}
