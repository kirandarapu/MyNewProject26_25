package ScreenshotsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		List<WebElement>all=driver.findElements(By.tagName("a"));
		
		System.out.println("total links:=====>  " +all.size());
		
		for(int i=0;i<all.size();i++) {
			
			System.out.println(all.get(i).getText());
		}

	}

}
