package ActionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExamples {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		//initilize the actions class
		
		Actions ac=new Actions(driver);
		
		//create the action
		
		WebElement ele1=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//perform the action
		ac.contextClick(ele1).build().perform();
		
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Copy']"));
		ele2.click();
		
		Thread.sleep(2000);
		//switch
		driver.switchTo().alert().accept();
		

	}

}
