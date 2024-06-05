package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples123 {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//enter into the frame
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	}

}
