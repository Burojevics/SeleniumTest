package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.delta.com/");

        WebElement calendar=driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();


        WebElement months = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean isFound=false;

        while(!isFound){

            String month = months.getText();
            if(month.equalsIgnoreCase("January")){
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text = day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }
            else {
                next.click();
            }

        }
    }
}



