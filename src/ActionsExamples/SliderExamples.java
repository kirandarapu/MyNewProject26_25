package ActionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExamples {

	public static WebDriver driver;
	public static void main(String[] args) {



		driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		//identify the element
		
		WebElement ele1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		System.out.println(ele1.getLocation());
		
		//create and build the action
		
		ac.dragAndDropBy(ele1, 150, 0).build().perform();
		
		System.out.println(ele1.getLocation());


	}

}
