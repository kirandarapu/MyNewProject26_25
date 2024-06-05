package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownswithoutSelectTage {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		//maximize the window
		
		driver.manage().window().maximize();
		
		//identify the dropdown button
		
		driver.findElement(By.id("country-list")).click();
		
		//identify the list of element's from the dropdown
		
		    List<WebElement>all= driver.findElements(By.xpath("//select[@id='country-list']/option"));
		    
		    int size=all.size();
		    
		    for(int i=0;i<size;i++) {
		    	//get the all values from the dropdown
		    	String values=all.get(i).getText();
		    	
		    	if(values.equals("USA")) {
		    		
		    		all.get(i).click();
		    	}
		    	
		    	
		
			
			
			
		}
		
		////select[@id='option-droup-demo']/optgroup/option

	}

}
