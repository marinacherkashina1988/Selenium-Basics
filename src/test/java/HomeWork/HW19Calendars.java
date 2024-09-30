package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HW19Calendars {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='from_date']")).click();
        boolean notFromMonth = true;

        while (notFromMonth) {
            WebElement fromMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String currentFromMonth = fromMonth.getText();

            if (currentFromMonth.equals("June")) {

                List<WebElement> allFromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement fromDate : allFromDates) {
                    String currentDate = fromDate.getText();
                    if (currentDate.equals("19")) {
                        fromDate.click();
                    }
                }
                notFromMonth = false;
            } else {
                WebElement prevButton = driver.findElement(By.xpath("//*[text()='Prev']"));
                prevButton.click();

            }
        }

        driver.findElement(By.id("to_date")).click();
        boolean notToMonth = true;

        while (notToMonth) {
            WebElement toMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String currentToMonth = toMonth.getText();

            if (currentToMonth.equals("December")) {

                List<WebElement> allToDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement toDate : allToDates) {
                    String currentDate = toDate.getText();
                    if (currentDate.equals("7")) {
                        toDate.click();
                    }
                }
                notFromMonth = false;
            } else {
                WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
                nextButton.click();
            }
        }
    }
}


