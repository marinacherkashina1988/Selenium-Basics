package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7CSS {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/cssSelector.php");
        WebElement profileId = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("Example Profile ID");
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("Profile");
        WebElement jennyFB = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        jennyFB.sendKeys("Blah Blah Blah");
        WebElement rajFB = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        rajFB.sendKeys("Nah Nah Nah");
        WebElement topic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        topic.sendKeys("Girafa");
        WebElement intro = driver.findElement(By.cssSelector("input[data-starts^='introCSS'"));
        intro.sendKeys("Hello");
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='345Input']"));
        conclusion.sendKeys("I am Girafa for suureeee ");
    }
}
