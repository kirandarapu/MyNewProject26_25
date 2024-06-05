package CalendersHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadingbyusingAutoit {

	   public static WebDriver driver;
	   public static void main(String[] args) throws IOException {
	       
	       driver=new ChromeDriver();
	       
	       driver.get("https://demo.automationtesting.in/Register.html");
	       
	       driver.manage().window().maximize();
	       
	       WebElement ele=driver.findElement(By.id("imagesrc"));
	       
	       Actions ac=new Actions(driver);
	       
	       ac.moveToElement(ele).click().perform();
	       
	       Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Documents\\Upload22.exe"+" "+"C:\\Users\\ADMIN\\Downloads\\Vinod.docx");

	       //Runtime.getRuntime().exec("path of .exe file");
	       System.out.println("file uploading completed");
	   }

	}


