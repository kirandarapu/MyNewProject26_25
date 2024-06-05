package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram22 {


    public static WebDriver driver;
    public static void main(String[] args) {
       
        driver=new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");

        //enter into the 1st frame
        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("Selenium");
       
        //exit from the frame
        driver.switchTo().defaultContent();
       
        //enter into the second frame
       
        driver.switchTo().frame(1);
       
        driver.findElement(By.name("mytext2")).sendKeys("testing");
       
        //exit from the frame
        driver.switchTo().defaultContent();
       
        //enter into the 3rd frame
       
        driver.switchTo().frame(2);
       
        driver.findElement(By.name("mytext3")).sendKeys("software testing");
       
        //enter into the inner frame
       
        driver.switchTo().frame(0);
       
        //find the element
       
        driver.findElement(By.cssSelector("div.AB7Lab")).click();
       
        //click check box
        //uHMk6b fsHoPb
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(1);
       
        driver.findElement(By.xpath("//div[@class='uHMk6b fsHoPb']")).click();
       
        //exit from the 3rd frame
       
        driver.switchTo().defaultContent();
       
        //enter into the 4th frame
       
        driver.switchTo().frame(3);
        driver.findElement(By.name("mytext4")).sendKeys("Testing");
       
       
    }

}
