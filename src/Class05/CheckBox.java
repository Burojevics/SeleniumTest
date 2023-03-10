package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement checkB: checkBoxes){
            String value= checkB.getAttribute("value");

            if(value.equalsIgnoreCase("Option-2")){
                checkB.click();
            }





        }

    }
}
