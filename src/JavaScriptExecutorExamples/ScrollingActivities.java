package JavaScriptExecutorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActivities {
public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.hubilo.com/");
		driver.manage().window().maximize();
		
		//initialize the JSE
		
		//scrolling down page by pixel through
		//scroll down the page till element present
		//scrolling till the end of the page
		//go back to the initial position
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//scrolling down page by pixel through
		
//		jse.executeScript("window.scrollBy(0,3000);", "");
//		
//		System.out.println(jse.executeScript("return window.pageYOffset;"));
//		
		//scroll down the page till element present
		
		//identify the element
		//driver.findElement(By.xpath("//div[@class='hero_p-_3-block-holder']"));)
		WebElement ele1=driver.findElement(By.xpath("//div[@class='hero_p-_3-block-holder']"));
		
//		jse.executeScript("arguments[0].scrollIntoView();", ele1);
//		System.out.println(jse.executeScript("return window.pageYOffset;"));

	    
		//scrolling till the end of the page
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;"));
		
		//scrolling into intial stage
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;"));
		
		
		
	
	
	}

}
