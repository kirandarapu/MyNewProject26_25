package ScreenshotsExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//initialize the TakesScreenshot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//capture screenshot to the ahole page
		//
		File source=ts.getScreenshotAs(OutputType.FILE);
		//target location to store the screenshot
		File target=new File("D:\\SeleniumPracticeWork\\SeleniumExamples\\Screenshots\\wholepage.png");
		
		FileUtils.copyFile(source,target);
		
		//capture screenshot for particular area
		
		WebElement ele1=driver.findElement(By.xpath("//td[@class='content_left']"));
		
		File src=ele1.getScreenshotAs(OutputType.FILE);
		File Target1=new File("D:\\SeleniumPracticeWork\\SeleniumExamples\\Screenshots\\Area.png");
		
		FileUtils.copyFile(src, Target1);
		
		
		//capture screenshot for particular element
		
		WebElement ele2=driver.findElement(By.xpath("//a[text()='info@adactin.com']"));
		
		File src2=ele2.getScreenshotAs(OutputType.FILE);
		
		File target2=new File("D:\\SeleniumPracticeWork\\SeleniumExamples\\Screenshots\\element.png");
		
		FileUtils.copyFile(src2, target2);

	}

}
