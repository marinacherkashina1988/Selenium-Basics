package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E23CalendarNavigationBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='start_date']")).click();

        WebElement month = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
        WebElement previousBtn = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[@class='prev']"));

        String currentMonth = month.getText();
        boolean notMonth = true;

        while(notMonth){
            if (currentMonth.equals("April 2024")){
                List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for (WebElement dates : allDates){
                    String currentDate = dates.getText();
                    if(currentDate.equals("6")){
                        dates.click();
                    }
                }
                notMonth=false;
            } else {
                previousBtn.click();
                currentMonth = month.getText();
            }
        }
    }
}
