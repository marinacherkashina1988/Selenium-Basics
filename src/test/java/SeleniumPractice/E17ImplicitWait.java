package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E17ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickBtn1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        clickBtn1.click();
        WebElement text1 = driver.findElement(By.xpath("//p[contains(text(),'Hello, this message')]"));
        System.out.println(text1.getText());

        WebElement clickBtn2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        clickBtn2.click();
        WebElement ddBtn = driver.findElement(By.xpath("//input[@value='Male']"));
        ddBtn.click();
    }
}
