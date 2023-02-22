package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        String URL= driver.getCurrentUrl();
        System.out.println(URL);

        String title= driver.getTitle();
        System.out.println("The title of the page is "+title);

        driver.close();




    }
}
