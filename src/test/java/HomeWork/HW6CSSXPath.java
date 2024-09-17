package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW6CSSXPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("12345");

        WebElement userName = driver.findElement(By.cssSelector("input[id*=UserName]"));
        userName.sendKeys("JohnDoe");

        WebElement intro = driver.findElement(By.cssSelector("input[data-starts^=introC]"));
        intro.sendKeys("Introduction to XPath");

        WebElement rayFeedback = driver.findElement(By.cssSelector("input[id$=FromRay]"));
        rayFeedback.sendKeys("Great explanation on advanced topics!");

        WebElement duckyFeedback = driver.findElement(By.cssSelector("input[id$=fromDucky]"));
        duckyFeedback.sendKeys("Clear and concise delivery.");

        WebElement clientId = driver.findElement(By.cssSelector("input[data-ends$=clientID]"));
        clientId.sendKeys("67890");

        WebElement email = driver.findElement(By.cssSelector("input[name^=email]"));
        email.sendKeys("john.doe@example.com");

        WebElement topic = driver.findElement(By.cssSelector("input[data-content*=intermediate]"));
        topic.sendKeys("CSS Selectors");
    }
}
