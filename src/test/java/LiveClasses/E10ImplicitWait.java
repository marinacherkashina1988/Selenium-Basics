package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E10ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickBtn= driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        clickBtn.click();

        WebElement checkbox = driver.findElement(By.xpath("//input[@value='Option-1']"));
        checkbox.click();

        driver.quit();
    }
}
