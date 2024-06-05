package WebDriverExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdownsExamples0012 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		//identify the search box
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//identify the list of elements
		
		List<WebElement>suggestions=driver.findElements(By.xpath("//div[contains(@class,'s-suggestion s-suggestion-ellipsis-direction')]//span"));
		
		System.out.println(suggestions.size());
		
		
		//select the options from the values
		
		for(int i=0;i<suggestions.size();i++) {
			
			String text=suggestions.get(i).getText();
			System.out.println(text);
			
			
			if(text.equals("mobiles 5g")) {
				
				suggestions.get(i).click();
				break;
			}
		}
		
		

	}

}
