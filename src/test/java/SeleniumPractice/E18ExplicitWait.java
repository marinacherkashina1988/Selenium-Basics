package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E18ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().window().maximize();

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='show_alert']"));
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement btn2 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        btn2.click();

        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));

        WebElement text = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());

    }
}
