package Class09;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    WebElement username= driver.findElement(By.id("txtUsername"));
    username.sendKeys("Admin");

    //to highlight stuff
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments[0].style.border='5px dotted blue'", username);

    WebElement loginButton= driver.findElement(By.xpath("//input[@id='btnLogin']"));
    js.executeScript("arguments[0].click();", loginButton);







    }
}
