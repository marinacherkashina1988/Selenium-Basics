package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E15Calendars {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("from_date")).click();

        String monthValue = "January";
        String yearValue = "2025";
        String dateValue = "5";
        boolean notFound = true;

        while (notFound){
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month.getText();
            String currentYear = year.getText();
            if (currentMonth.equals(monthValue) && currentYear.equals(yearValue)){
                List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement date : allDates){
                    String currentDate = date.getText();
                    if (currentDate.equals(dateValue)){
                        date.click();
                        break;
                    }
                }
                notFound = false;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            }
        }
    }
}
