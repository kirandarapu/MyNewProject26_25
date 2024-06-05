package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleone {
public static WebDriver driver;
	public static void main(String[] args) {
		
 driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self  - Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/self::a")).getText();
		System.out.println("Self : "+ text); //NIIT Ltd

	}

}
