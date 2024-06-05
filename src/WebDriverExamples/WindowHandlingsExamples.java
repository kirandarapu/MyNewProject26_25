package WebDriverExamples;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingsExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//set the window size
		int Height=1500;
		int width=700;
		
		Dimension d=new Dimension(Height,width);
		
		driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();
		//click the link on the application
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		ele.click();
		
		//identify the windows
		
		Set<String>windows=driver.getWindowHandles();
		
		//converted into list
		
		List<String>Windowsids=new ArrayList(windows);
		System.out.println(Windowsids);
		
		String parentwindow=Windowsids.get(0);
		String childwindow=Windowsids.get(1);
		
		//switch to parent window
		
		//driver.switchTo().window(Windowsids.get(0));
		
		String title1=driver.switchTo().window(parentwindow).getTitle();
		
		if(title1.equals("OrangeHRM")) {
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

	}

}
