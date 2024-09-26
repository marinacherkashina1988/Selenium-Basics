package LiveClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E9Alerts {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement alert3Btn = driver.findElement(By.xpath("//button[text()='Enter Your Name']"));
        alert3Btn.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("abracadabra");
        alert.accept();
    }
}