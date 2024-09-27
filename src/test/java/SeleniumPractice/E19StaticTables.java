package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E19StaticTables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().window().maximize();

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row: allRows){
            System.out.println(row.getText());
        }

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement column: columns){
            System.out.println(column.getText());
        }

        List <WebElement> rowByContains = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count=1; //to find row that contain "in progress"
        for (WebElement row: rowByContains){
            String status = row.getText();
            if (status.equals("in progress")){
                //System.out.println(count); //to print rows with "in progress"
                WebElement rowstatus = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(rowstatus.getText());
            }
            count++;
        }

    }
}
