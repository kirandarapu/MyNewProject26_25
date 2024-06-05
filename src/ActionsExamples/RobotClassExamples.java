package ActionsExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExamples {

	public static WebDriver driver;
	public static void main(String[] args) throws AWTException {

		//initialize the webdriver
		driver=new ChromeDriver();

		//launching the web application

		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("userName")).sendKeys("Kiran");

		driver.findElement(By.id("userEmail")).sendKeys("abcd@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");

		
		//initialize the robot class
		
		Robot r=new Robot();
		
		//select the text(control+A)
		//press the control and A buttons in the keyboard
		
		r.keyPress(KeyEvent.VK_CONTROL);//It is press the the control button
		r.keyPress(KeyEvent.VK_A);//it is press the 'A button 
		
		//release the control and A buttons
		
		r.keyRelease(KeyEvent.VK_CONTROL);//release the button
		r.keyRelease(KeyEvent.VK_A);//release the A button
		
		//copy the text  (control+ c)
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		//release the button (control and C)
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		//clicking the TAB button
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//paste the text(control+V)
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release the buttons(Control and V)
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//again perform clicking activity (Tab)
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//perform submit button clicking activity
		driver.findElement(By.id("submit")).click();
		
		

	}

}
