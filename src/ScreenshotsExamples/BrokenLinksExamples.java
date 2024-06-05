package ScreenshotsExamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksExamples {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//find how many links available on the web page
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("total links : ===> "+links.size());
		
//		for(int i=0;i<links.size();i++) {
//			System.out.println(links.get(i).getText());
//				
//			
//		}
		
		int brokenlinks=0;
		
		for(WebElement alllinks:links) {
			
			String hrefAttvalue=alllinks.getAttribute("href");
			
			if(hrefAttvalue==null||hrefAttvalue.isEmpty()) {
				
				System.out.println("href attribute value is empty  ...."+ hrefAttvalue);
				continue;
			}
			
			//check the link is broken or not
			//create the connection   ==> strings values convert into URL(uniform resource locator)
			
			URL linkurl=new URL(hrefAttvalue);
			//https://www.google.com/
			
			//create the connection
			
			HttpURLConnection connection=(HttpURLConnection) linkurl.openConnection();
			
			connection.connect(); //server ==> to provide the request to the server ==> create the response
			
			
			if(connection.getResponseCode()>=400) {
				System.out.println(hrefAttvalue+"  "+"====>" + "it is a Broken link");
				
				brokenlinks++;
			}else
			{
				System.out.println(hrefAttvalue+ "  "+ "====>  it is not a broken link");
			}
		}
		
		System.out.println("total broken links available ini the wrwebpage "+brokenlinks );
		

	}

}
