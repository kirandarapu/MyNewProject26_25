package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample33 {

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
       
        driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        Thread.sleep(3000);
        //enter into the frame
        driver.switchTo().frame("a077aa5e");
       
        driver.findElement(By.xpath("/html/body/a/img")).click();

    }

}
