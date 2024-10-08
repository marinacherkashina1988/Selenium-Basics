package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E3TagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link:links){
            System.out.println(link.getAttribute("href"));
        }
        driver.quit();
    }
}
