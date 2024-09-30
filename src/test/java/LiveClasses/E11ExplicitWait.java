package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E11ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();

        WebElement clickBtn = driver.findElement(By.id("changetext_button"));
        clickBtn.click();

        WebElement msg = driver.findElement(By.id("headingtext"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.id("headingtext"), "Ssyntaxtechs"));
        System.out.println(msg.getText());

        WebElement clickBtn1 = driver.findElement(By.id("enable_button"));
        clickBtn1.click();

        WebElement buttonBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        buttonBtn.click();
        boolean isClicked = true;
        if (isClicked) {
            System.out.println("Button is clicked");
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox")));
        driver.findElement(By.id("checkbox")).click();

        driver.findElement(By.id("checkbox_button")).click();
        boolean isSelected = true;
        if(isSelected) {
            System.out.println("The checkbox is selected");
        }


    }
}
