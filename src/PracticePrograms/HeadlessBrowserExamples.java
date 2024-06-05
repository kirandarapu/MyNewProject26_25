package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		EdgeOptions options=new EdgeOptions();
		options.setHeadless(true);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		
		driver.get("https://www.google.com/");
		
		

	}

}
