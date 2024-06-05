package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownswithSelectTag {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement ele=driver.findElement(By.id("country-list"));
		
		ele.click();
		
		Select sc=new Select(ele); // select is class
		
//		//selectByVisible Text
//		sc.selectByVisibleText("India");
//		
//		//selectByIndex
//		
//		sc.selectByIndex(3);
		
		
		//selctByVlaue
		
		sc.selectByValue("5");
		
		
		

	}

}
