package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E19SenDkeys {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("");

        WebElement userName = driver.findElement(By.id("txtUserame"));
        userName.sendKeys("Admin", Keys.ENTER);
        userName.sendKeys(Keys.TAB);

        Actions action = new Actions (driver);
        action.sendKeys("ABCDE").perform();
    }
}
