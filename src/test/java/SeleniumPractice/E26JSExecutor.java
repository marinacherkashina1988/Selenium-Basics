package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E26JSExecutor {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        driver.manage().window().maximize();

        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red'", hoverBtn);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-1000)");

        WebElement fileUpload = driver.findElement(By.xpath("//a[text()='File Upload']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()", fileUpload);

    }
}
