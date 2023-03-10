package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleMyPractice {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.gmail.com/");

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle); //to print single handle

      Set <String> windowHandles=driver.getWindowHandles();
      for(String wh:windowHandles){
          System.out.println(windowHandles); //to print all the handles
      }







    }
}
