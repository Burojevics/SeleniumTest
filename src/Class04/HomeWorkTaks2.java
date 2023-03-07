package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWorkTaks2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> options=driver.findElements(By.cssSelector("input[class='cb1-element']"));

        for(WebElement fourOptions: options){
            String obj=(fourOptions.getAttribute("class"));

            if(obj.equalsIgnoreCase("Option 1")){
                fourOptions.click();
                Thread.sleep(4000);

            } else if(obj.equalsIgnoreCase("Option 2")){
                fourOptions.click();
                Thread.sleep(4000);

            } else if(obj.equalsIgnoreCase("Option 3")){
                fourOptions.click();
                Thread.sleep(4000);

            } else if(obj.equalsIgnoreCase("Option 4")){
                fourOptions.click();
            }

        }



    }
}
