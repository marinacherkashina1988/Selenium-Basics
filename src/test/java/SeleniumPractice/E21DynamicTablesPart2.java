package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class E21DynamicTablesPart2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        boolean notFound = true;

        while (notFound){

            int count = 1;
            for (WebElement id : allIDs) {
                String idNo = id.getText();
                if (idNo.equals("34218251")) {
                    System.out.println(count);

                    WebElement checkbox= driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
                    checkbox.click();
                    notFound = false;

                }
                count = count + 1;
            }
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextBtn.click();
                allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }
        driver.quit();
    }
}
