package LiveClasses;

import jdk.swing.interop.DropTargetContextWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E12StaticTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        driver.manage().window().maximize();

        List<WebElement> allCountries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count = 1;

        for (WebElement countries : allCountries) {
            String country = countries.getText();
            if (country.equals("USA")) {
                WebElement rows = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(rows.getText());
            }
            count++;
        }
    }
}
