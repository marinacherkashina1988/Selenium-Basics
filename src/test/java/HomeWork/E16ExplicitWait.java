package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E16ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe((By.xpath("//h2[@id='headingtext']")), "Ssyntaxtechs"));

        WebElement text = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());

        WebElement btn2 = driver.findElement(By.xpath("//button[@id='enable_button']"));
        btn2.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        checkbox.click();

        WebElement btn3 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        btn3.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox")));
        boolean isSelected = checkbox.isSelected();
        if (isSelected) {
            System.out.println("Checkbox is selected: " + isSelected);
        }
    }
}
