package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnalystNames {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		//lanuch webdriver
		
		driver=new ChromeDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement>all=driver.findElements(By.xpath("//td[text()='Senior Analyst']//preceding-sibling::td[2]"));
     //int
		int size=all.size();//how many elements available
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			
			System.out.println(all.get(i).getText());
		}
		
		List<WebElement>numbers=driver.findElements(By.xpath("//td[text()='Vinod']//following-sibling::td[3]"));
		
		int num=numbers.size();
		
		for(int i=0;i<num;i++) {
			
			System.out.println("Vinod  " +numbers.get(i).getText());
		}
	
	}

}
