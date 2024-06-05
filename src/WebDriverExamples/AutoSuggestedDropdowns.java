package WebDriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdowns {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//launching the webdriver
		
		driver=new ChromeDriver();
		
		//launching the webapplication
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("men");
		
		//identify the list of elements
		
		 List<WebElement>all= driver.findElements(By.xpath("//div[contains(@role,'button')]//span"));

		  System.out.println(all.size());
		 
		 
		 //select option from the list of elements
		 
		 for(int i=0;i<all.size();i++) {
			 
			 String values=all.get(i).getText();
			 System.out.println(values);
			 
			 
//			 if(values.equals("solar eclipse glasses")) {
//				 
//				 Thread.sleep(2000);
//				 all.get(i).click();
//				 break;
//			 }
			 
		 }
	}

}
