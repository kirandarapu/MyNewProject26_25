package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//identify the pages
		
		List<WebElement>pages=driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
        System.out.println(pages.size());//4 pages
        
        for(int i=0;i<4;i++) {
        	
        	
        	
        	try {
        		
        		//identify the no of rows
        		
        		int noofrows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
        	System.out.println(noofrows);//5 rows
        	
        	
        	
        	//fetch the data from the webtable
        	
        	for(int r=1;r<=noofrows;r++) {
        		
        		String Name=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]")).getText();
        	
        	    System.out.println(Name);//all names in the console window
        	    
        	    
        	
        	}
        	
        	
        	}catch(Exception e) {
        		
        		e.printStackTrace();
        	}
        	
        	pages.get(i).click();//1//2//3//4
        }
       
		
	}

}
