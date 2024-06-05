package JavaScriptExecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE22 {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor )driver;
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		
		jse.executeScript("arguments[0].setAttribute('value','Admin')", ele1);
		
		


	}

}
