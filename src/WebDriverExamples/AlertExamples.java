package WebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//initilize the alert
		
		Alert a=driver.switchTo().alert();
		
		//click the normal alert button
		
	 
		Thread.sleep(2000);
		
		//clicking the ok button
		a.accept();
		
		
		//confirmation alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//accept the alert
		Thread.sleep(2000);
//		a.accept();
		//cancel the alert
		a.dismiss();
		
		
		//prompt alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		a.sendKeys("Kiran");
		a.accept();
		
		String act_res=driver.findElement(By.xpath("//p[text()='You entered: Kiran']")).getText();
		System.out.println(act_res);
		
		String exp_res="You entered: Kiran";
		
		if(act_res.equals(exp_res)) {
			
			System.out.println("test case is passed");
		}else
		{
			System.out.println("testcase is failed");
		}
	
	}

}
