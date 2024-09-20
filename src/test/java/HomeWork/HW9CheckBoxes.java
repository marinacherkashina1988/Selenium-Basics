package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HW9CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement subscribe = driver.findElement(By.xpath("//input[@type='checkbox' and @id='newsletter']"));
        boolean isEnabled = subscribe.isEnabled();
        if (isEnabled) {
            subscribe.click();
        }

        List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb-element']"));
        for (WebElement hobby : hobbies) {
            if (hobby.getAttribute("value").equals("reading") || hobby.getAttribute("value").equals("cooking")) {
                hobby.click();
            }
        }

        WebElement showCheckboxes = driver.findElement(By.xpath("//button[text()='Show/Hide Interests Section']"));

        WebElement support = driver.findElement(By.xpath("//input[@value='Support' and @class='checkbox-field']"));
        boolean supportDisplayed = support.isDisplayed();
        WebElement music = driver.findElement(By.xpath("//input[@class='checkbox-field' and @value='Music']"));

        boolean musicDisplayed = music.isDisplayed();

        if (!supportDisplayed && !musicDisplayed) {
            showCheckboxes.click();
        }
        Thread.sleep(500);
        music.click();

        WebElement notifications = driver.findElement(By.xpath("//input[@class='checkbox-field' and @value='Receive-Notifications']"));
        boolean notificationDisabled = notifications.isEnabled();

        WebElement enableCheckboxes = driver.findElement(By.xpath("//button[@id='enabledcheckbox' and text()='Enable Checkboxes']"));
        if (!notificationDisabled) {
            enableCheckboxes.click();
        }
        notifications.click();
        driver.quit();
    }
}
