package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3IntroToLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Jonathan Doe");

        WebElement email = driver.findElement(By.name("yourEmail"));
        String emailExample = "jonathan.doe@example.com";
        if (emailExample.contains("@")) {
            email.sendKeys("jonathan.doe@example.com");
        } else {
            System.out.println("The email is invalid. Please try again");
        }

        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Alice Smith");

        WebElement clientId = driver.findElement(By.name("ClientId"));
        clientId.sendKeys("CLN-2045X");

        WebElement feedback = driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("The courses were highly practical, and the instructors provided excellent guidance throughout. I feel confident in applying my new skills!");

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("ShopEase Online Marketplace");

        WebElement deadline = driver.findElement(By.id("ProjectTimeId"));
        deadline.sendKeys("September 30, 2024, 5:00 PM");

        WebElement currentAddress = driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("1234 Elm Street, Apt 56B, New York, NY, 10001");

        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("789 Oak Avenue, Springfield, IL, 62704");

        WebElement link = driver.findElement(By.linkText("Click Here."));
        link.click();
        WebElement button = driver.findElement(By.id("btn-submit"));
        button.click();

        driver.quit();
    }
}
