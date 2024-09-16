package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.syntaxprojects.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(500);
        driver.navigate().refresh();
        driver.quit();
        //driver.close(); - to close only one window
    }
}
