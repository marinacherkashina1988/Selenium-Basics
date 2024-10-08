package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class E24KeyboardKeys {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/keypress.php");
        driver.manage().window().maximize();

        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys(Keys.ENTER);
        inputBox.sendKeys(Keys.TAB);
        inputBox.sendKeys("Marina"+Keys.ENTER);
    }
}
