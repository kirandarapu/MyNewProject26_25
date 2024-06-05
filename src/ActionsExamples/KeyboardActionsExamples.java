package ActionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		int width=1000;
		int Height=700;
		Dimension d=new Dimension(width,Height);
		
		driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		
		driver.findElement(By.id("userName")).sendKeys("Kiran");
		
		driver.findElement(By.id("userEmail")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
		
		//Select the text from the current address(ctrl+a)
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		//copy the text from the current address(ctrl+c)
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//clicking tab button
		
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//paste the copied text from the current address
		
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//again click tab button
		
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		

	}

}
