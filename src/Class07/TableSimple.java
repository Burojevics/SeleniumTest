package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");


        //get the whole table and print it on the console
        //table access 1-table based access

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
        System.out.println(table_data);

        //row level access
        //get the rows of the table and print them
        //print the row that contains company and google

        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for(WebElement row:Rows){
            String row_text=row.getText();
            if(row_text.contains("Google")) {

                System.out.println(row_text);
            }
        }

        //column level access

        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column:columns){
            System.out.println(column.getText());
        }


        List  <WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement first_col:firstColumn){
            System.out.println(first_col.getText());
        }


    }
}
