package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW17StaticTables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        driver.manage().window().maximize();

        List<WebElement> allCountries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));

        int count = 1;

        for (WebElement countriesRow : allCountries) {
            String countrySearch = countriesRow.getText();
            if (countrySearch.equals("USA")) {
                System.out.println(count); //not really necessary to have this print out
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(row.getText());
            }
            count++;
        }

        System.out.println();

        String countryName="USA";
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        for (WebElement row : allRows) {
            WebElement countryColumn = row.findElement(By.xpath("td[3]"));
            String country = countryColumn.getText();
            if (country.equals(countryName)) {
                System.out.println(row.getText());
            }
        }
        driver.quit();
    }
}
