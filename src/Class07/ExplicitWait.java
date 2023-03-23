package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");

        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        // as the element that contains text becomes visible after some time
        // first we need ti implement the Explicit wait and then get the text

        WebDriverWait wait=new WebDriverWait(driver,20); // he put 20 here
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));


       WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
       String wText= text.getText();
       System.out.println(wText);





    }
}
