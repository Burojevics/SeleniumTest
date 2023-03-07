package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement createNewButton=driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));
        createNewButton.click();

        Thread.sleep(4000);

        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Lana");






    }
}
