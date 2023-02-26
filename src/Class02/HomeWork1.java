package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Svetlana");
        driver.findElement(By.id("customer.lastName")).sendKeys("Burojevic");
        driver.findElement(By.id("customer.address.street")).sendKeys("800 N Olive Rd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Kula");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33404");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123 456 78 90");
        driver.findElement(By.id("customer.ssn")).sendKeys("300 95 3005");
        driver.findElement(By.id("customer.username")).sendKeys("Svetlana1");
        driver.findElement(By.id("customer.password")).sendKeys("BoniAron33");
        driver.findElement(By.id("repeatedPassword")).sendKeys("BoniAron33");
        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);
        driver.close();





    }
}
