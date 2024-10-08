package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E18JSExecutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        driver.manage().window().maximize();

        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("argument[0].style.border='3px solid red'", hoverBtn);

        //WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        js.executeScript("window.scrollBy(0, 500)");
        js.executeScript("window.scrollBy(0, -500)");

    }
}
