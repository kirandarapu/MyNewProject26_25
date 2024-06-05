package CalendersHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingByusingSendkeys {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("imagesrc"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele1);
		//ele1.click();
		Thread.sleep(3000);
		ele1.sendKeys("C:\\Users\\ADMIN\\Downloads\\Vinod.G_CV (1).pdf");
		

	}

}
