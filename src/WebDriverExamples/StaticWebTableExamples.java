package WebDriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		//initialize the webdriver
		
		driver=new ChromeDriver();
		
		//launching the web application
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//identify the no of rows in a web table
		
		List<WebElement>rows=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		//identify the no columns in the table
		List<WebElement>columns=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr/th"));
		
		System.out.println(columns.size());
		
		//get the specific row data
		
		WebElement ele1=driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr[5]"));
		
		System.out.println(ele1.getText());
		
		//get the specific column data
		
	List<WebElement>Authors=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr/td[2]"));

	for(int i=0;i<Authors.size();i++) {
		
	
	System.out.println(Authors.get(i).getText());
	}
	
	//get whole data of the table
	
	List<WebElement>tabledata=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr"));
	
	for(int i=0;i<tabledata.size();i++) {
		
		System.out.println(tabledata.get(i).getText());
	}
	
	
	//specifc cell data need to prinited in the console window
	
	//conditonal point 
	
	//who's subject name java print their names in the console window
	
	for(int r=2;r<=rows.size();r++) {
		
		
		String Subjects=driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+r+"]/td[3]")).getText();
		
		if(Subjects.equals("Selenium")) {
			
			String Author=driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
		     System.out.println(Subjects+ "  "+ Author);
		}
		
		
	}
	
	
	
	}
	
	

}
