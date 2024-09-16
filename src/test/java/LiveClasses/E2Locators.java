package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("john.doe@google.com");
        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("Doe@123456");
        WebElement button = driver.findElement(By.partialLinkText("Create new"));
        button.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");

    }
}
