package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HW14WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement b1 = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        b1.click();

        WebElement b2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        b2.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();

            if (url.equals("https://syntaxprojects.com/b1-page.php")){
                WebElement msg = driver.findElement(By.xpath("//div[@class='col-md-6 text-left']"));
                if (msg.getText().equals("Welcome to B1 page")){
                    System.out.println("The correct message for B1 page is displayed");
                } else {
                    System.out.println("The displayed message for B1 page is incorrect");
                }
            } else if (url.equals("https://syntaxprojects.com/b2-page.php")) {
                WebElement msg2 = driver.findElement(By.xpath("//div[@class='col-md-6 text-left']"));
                if (msg2.getText().equals("Welcome to B2 page")){
                    System.out.println("The correct message for B2 page is displayed");
                } else {
                    System.out.println("The displayed message for B2 page is incorrect");
                }
            }
        }
        driver.quit();
    }
}
