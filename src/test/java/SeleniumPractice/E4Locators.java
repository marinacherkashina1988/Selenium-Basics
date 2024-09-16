package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4Locators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Doe");
        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("john.doe@gmail.com");
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();
        WebElement link1 = driver.findElement(By.linkText("Click Here."));
        link1.click();
        WebElement link2 = driver.findElement(By.partialLinkText("Link"));
        link2.click();
    }
}
