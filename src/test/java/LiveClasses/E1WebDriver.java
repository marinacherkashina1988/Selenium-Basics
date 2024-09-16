package LiveClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1WebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com");
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
