package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWorkTask2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement text=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        text.clear();
        text.sendKeys("Hello World!");

        driver.switchTo().defaultContent();



    }
}
