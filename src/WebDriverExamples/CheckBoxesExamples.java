package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxesExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		//
		driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");
		
		//maximize the window
		
		driver.manage().window().maximize();
//		//minimize the window
//		driver.manage().window().minimize();
		//click the button
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//1.identify the total no of the check boxes
		
		List<WebElement>cBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size= cBoxes.size();
		
		System.out.println(size);
		
		//check all checkboxes
		
//		for(int i=0;i<size;i++) {
//			cBoxes.get(i).click();
//		}
		
		
		//check first two checkboxes
		
		
//		for(int i=0;i<2;i++) { // ==> 0<2==satisfied , 1<2== satisfied  ,,2<2==not satisfied
//			
//			cBoxes.get(i).click();
//		}
		
		//last two checkboxes
	
		//total checkboxes -number of checkboxes   (11-2)=9
//		
//		for(int i=9;i<11;i++) {
//			cBoxes.get(i).click();
//		}
		
		//checking the check boxes alternatively
		
		for(int i=0;i<size;i=i+3) {
			cBoxes.get(i).click();
		}
		
	}

}
