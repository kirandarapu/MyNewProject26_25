package JavaScriptExecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEClickingActivities {
	public static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//send some text into the username by using JSE
		
		//initialize the Javascript executor
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//identify the username element
		WebElement ele1=driver.findElement(By.id("username"));
		
		jse.executeScript("arguments[0].setAttribute('value','naveen2747')", ele1);
		    //binary language (0 and ones) 0==ok ,1==not okay
		
		WebElement ele2=driver.findElement(By.id("password"));
		
		jse.executeScript("arguments[0].setAttribute('value','Tester@2747')", ele2);
		
		//clicking activity
		
		WebElement ele3=driver.findElement(By.id("login"));
		
		jse.executeScript("arguments[0].click();", ele3);
		

	}

}
