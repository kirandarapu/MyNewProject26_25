package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static WebDriver driver;
	public static void main(String[] args) {

    //webdriver intialization
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.hubilo.com/"); //it is shows the home page
		
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();  // it is shows the login page
		//NoSuchElementException
		List<WebElement>all=driver.findElements(By.tagName("aa"));
		//zero or empty
		System.out.println(all);
		
		driver.navigate().back();  //it is go back into the Home page
		
		//forwared method
		driver.navigate().forward();// it is shows the login page again
		
		//refersh()
		
		driver.navigate().refresh();//it is refresh the current page of the webapplication
		
	}

}
