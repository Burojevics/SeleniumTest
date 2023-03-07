package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement gender=driver.findElement(By.cssSelector("input[value='Female']"));

        boolean isEnabled=gender.isEnabled();
        System.out.println("The radio button female is enabled= "+isEnabled);


        boolean isDisplayed= gender.isDisplayed();
        System.out.println("The radio button female is displayed= "+isDisplayed);

        boolean isSelected= gender.isSelected();
        System.out.println("The radio button female is selected= "+isSelected);
        if(!isSelected) {
            gender.click();
        }

        isSelected=gender.isSelected();
        System.out.println("The status of selection is= "+isSelected);







    }
}
