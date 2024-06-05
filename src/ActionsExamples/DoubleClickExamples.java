package ActionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		driver.manage().window().maximize();

		//initilize the actions class

		Actions ac=new Actions(driver);
		
		//enter into the frame
		
		driver.switchTo().frame("iframeResult");
		
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		//create the action and perform the action (double click)
		
		ac.doubleClick(ele1).build().perform();
		
		WebElement ele2=driver.findElement(By.id("field2"));
		String text=ele2.getText();
		
		System.out.println(text);
		
//		if(text.equals("Hello World!")) {
//			
//			System.out.println("double clicking activity is completed");
//		}
//		else {
//			System.out.println("it's not completed!");
//		}
		

	}

}
