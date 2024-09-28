package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW18DynamicTables {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        int count = 1;
        boolean notFound = true;

        while (notFound) {
            for (WebElement ID : allIDs) {
                String idNumber = ID.getText();
                if (idNumber.equals("37908884")) {
                    //System.out.println(count); //optional
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
                    checkbox.click();
                    notFound = false;
                }
                count++;
            }
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextBtn.click();
                allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }
    }
}
