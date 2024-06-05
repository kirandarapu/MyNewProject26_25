package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample44 {
	
	   public static WebDriver driver;
	   public static void main(String[] args) throws InterruptedException {
	       
	       driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       driver.get("https://demo.opencart.com/admin/index.php");
	       
//	        int Width=500;
//	        int Height=1000;
//	        Dimension d=new Dimension(Width,Height);
//	        driver.manage().window().setSize(d);
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("input-username")).sendKeys("demo");
	       driver.findElement(By.id("input-password")).sendKeys("demo");
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       
	       Thread.sleep(10000);
	       
	       WebElement ele1=driver.findElement(By.xpath("//button[@class='btn-close']"));
	if(ele1.isDisplayed()) {
	   ele1.click();
	}

	driver.findElement(By.xpath("//li[@id='menu-customer']/a")).click();
	driver.findElement(By.xpath("//ul[@id='collapse-5']/li/a")).click();

	//find the How many pages available in the webtable

	WebElement ele2= driver.findElement(By.xpath("//form[@id='form-customer']/div[2]/div[2]"));
	    String text=ele2.getText();
	   
	    //Showing 1 to 10 of 16811 (1682 Pages)==> string format
	    //Convert String into INT
	    int Pages=Integer.parseInt(text.substring ((text.indexOf("(")+1),text.indexOf("Pages")-1));
	    System.out.println(Pages); //1682
	   
	    //how many rows available in each and everypage
	   
	    for(int i=1;i<=9;i++) {
	        try {
	        WebElement ele3=driver.findElement(By.xpath("//ul[@class='pagination']/li/*[text()="+i+"]"));
	        int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
	        System.out.println(noOfRows);//10 rows
	        ele3.click();
	       
	        //fetch the data from the webtable
	       
	        for(int r=1;r<=noOfRows;r++) {
	            String Customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+i+"]/td[2]")).getText();
//	         System.out.println(Customername);
	           
	            String EmailID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+i+"]/td[3]")).getText();
	System.out.println(Customername);
	           
	           
	            //             List<WebElement>all=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[\"+i+\"]/td[1]/input"));
//	         for(int c=0;c<=all.size();c++) {
//	             all.get(c).click();
////	             Thread.sleep(2000);
//	            
//	            
//	         }
	           
	           
	        }
	       
	        }
	        catch(Exception e) {
	            e.getMessage();
	        }
	    }
	   }

}
