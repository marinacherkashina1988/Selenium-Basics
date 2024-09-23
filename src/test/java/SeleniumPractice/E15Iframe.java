package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E15Iframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        driver.switchTo().frame(0);
        WebElement topicBox = driver.findElement(By.xpath("//input[@name='Topic']"));
        topicBox.sendKeys("Hello!");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dd);
        select.selectByVisibleText("Big Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(nestedIframe);

        WebElement framecheckbox = driver.findElement(By.xpath("//input[@class='cb1-element' and @value='Option-1']"));
        framecheckbox.click();
    }
}
