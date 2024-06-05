package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//initialize the browser
		driver=new ChromeDriver();
		
		//get(String url)
		
		driver.get("https://adactinhotelapp.com/Register.php");
		
		System.out.println(driver.getTitle());
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		
		Thread.sleep(3000);
		//driver.close();//current window close
		
		driver.quit();//close all associate windows
		

	}

}
