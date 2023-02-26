package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Svetlana");
        driver.findElement(By.name("lastname")).sendKeys("Burojevic");
        driver.findElement(By.name("reg_email__")).sendKeys("774 456 78 90");
        driver.findElement(By.name("reg_passwd__")).sendKeys("BoniAron33");
        driver.findElement(By.name("birthday_month")).sendKeys("January");
        driver.findElement(By.name("birthday_day")).sendKeys("1");
        driver.findElement(By.name("birthday_year")).sendKeys("1993");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(6000);
        driver.close();
        driver.quit();















    }
}
