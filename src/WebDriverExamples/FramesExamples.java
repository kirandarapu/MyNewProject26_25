package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		//enter into the frame
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		
		driver.findElement(By.name("mytext1")).sendKeys("Automation Testing");
        //exit from the frame1
		driver.switchTo().defaultContent();
		
		//enter into the frame2
		driver.switchTo().frame(1);
		
		//identify the input box
		driver.findElement(By.name("mytext2")).sendKeys("Manual Testing");
	    //exit from the frame 2
		
		driver.switchTo().defaultContent();
		
		//enter into frame3
		driver.switchTo().frame(2);
		
		driver.findElement(By.name("mytext3")).sendKeys("Database Testing");
	
	   //enter into the inner frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id='i8']/div[3]/div")).click();
	
		driver.findElement(By.xpath("//*[@id='i25']/div[2]")).click();
		
		//exit from the frame
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		
		driver.findElement(By.name("mytext4")).sendKeys("Api automation");
		
	}

}
