package CalendersHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadingByusingRobot {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.name("uploadfile_0"));
		
		//initialize the actions class
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(ele1).click().perform();
		
		Thread.sleep(4000);
		
		//initilize the Robot class
		Robot r=new Robot();
		//select the file from the home directory
		
		StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\Downloads\\Vinod.G_CV (1).pdf");
       
		//copy the file
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste the file
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release the buttons
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//click on Enter button
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("fileuploading is completed");
		
		
	}

}
