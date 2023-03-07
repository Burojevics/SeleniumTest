package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTask1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement age=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelected= age.isSelected();
        System.out.println("The radio button check box is selected= "+isSelected);

        if(!isSelected){
            age.click();
        }

        isSelected=age.isSelected();
        System.out.println("The status of selection is= "+isSelected);

        Thread.sleep(4000);

        driver.close();

    }
}

