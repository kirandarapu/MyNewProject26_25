package TabsAndWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabandWindow {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://adactinhotelapp.com/");
		
		//new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
