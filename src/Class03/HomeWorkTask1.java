package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTask1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Hi, my nickname is Lana");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        WebElement getTotal=driver.findElement(By.xpath("//label[text()=' Total a + b = ']"));
        System.out.println(getTotal.getText());

        Thread.sleep(5000);
        driver.close();





    }
}
