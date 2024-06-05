package CalendersHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample001 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		//Date picker  2 ways pick the date
		//by using send keys method
		//by using conditions
		
		driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("first_date_picker"));
		
		ele1.click();//open the calender
		
		ele1.sendKeys("04/18/2024");

	}

}
