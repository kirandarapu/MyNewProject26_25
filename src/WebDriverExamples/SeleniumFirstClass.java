package WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	
	//public WebDriver driver;
	public static WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver();
		
		 driver=new ChromeDriver();
		 
		 driver=new FirefoxDriver();
		 driver=new EdgeDriver();
		 
		 
		 WebDriver driver=new ChromeDriver();
		 
		// ChromeDriver driver=new ChromeDriver();
		 
		
		
		
		
		//classname obj=new classname();
		//System.setProperty("webdriver.chrome.driver", "chromedriverpath");
	//	==>selenium2.0 and 3.0
		
		
		//Webdriver driver=new ChromeDriver()?
		
		//webdriver==interface
			//	driver ==refrence object
		//new ==keyword
		//chromeDriver() ==it is the child class of webdriver
		
		//browser intialization
		
		//selenium 2.0 and 3.0 ==>Webdriver driver=new ChromeDriver()
		//selenium 4.0 ==>driver=new chromeDriver();

	}

}
