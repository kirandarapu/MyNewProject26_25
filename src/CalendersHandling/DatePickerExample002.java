package CalendersHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample002 {

	public static WebDriver driver;
	public static void main(String[] args) {

		//indentation(ctrl+a)and (ctrl+ i)

		//pick the date by using conditions

		driver=new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("first_date_picker"));
		ele1.click();
		
		//Create the parameters
		String month="July";
		String year="2024";
		String date="1";
		
		while(true) {
			
			//identify the month and year
			
			String months=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String Years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(months.equals(month)&& (Years.equals(year))){
				break;
				
			}
			
			
			
			WebElement ele2=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ele2);
			
			//ele2.click();
		}
		
		//select the date
		
		List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		//indetify the size of the elements
		
		int dates=alldates.size();
		System.out.println(dates);
		
		for(int i=0;i<dates;i++) {
			
			if(alldates.get(i).getText().equals(date)) {
				
				alldates.get(i).click();
				
				System.out.println("the date picking is completed");
			}
		}

		
	}

}
