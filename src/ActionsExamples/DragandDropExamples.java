package ActionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExamples {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		//identify the element
		
		WebElement source1=driver.findElement(By.id("box3"));
		
		WebElement destination1=driver.findElement(By.id("box103"));
		
		//perform the drag and drop action
		
		ac.dragAndDrop(source1, destination1).build().perform();

	}

}
