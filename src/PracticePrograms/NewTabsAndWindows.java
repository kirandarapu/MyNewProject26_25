package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsAndWindows {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//open new tab
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.com/");

	}

}
