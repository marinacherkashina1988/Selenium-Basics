package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E14DynamicTablePagination {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        boolean notFound = true;

        while (notFound) {
            List<WebElement> allIDs = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < allIDs.size(); i++) {
                if (allIDs.get(i).getText().equals("111015A")) {
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkbox.click();
                    notFound=false;
                    break;
                }
            }
            if (notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextBtn.click();
            }
        }
    }
}
