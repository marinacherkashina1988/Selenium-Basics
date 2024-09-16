package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW1FirefoxBrowser {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.syntaxprojects.com/");
        String pageTitle = driver.getTitle();
        String url = driver.getCurrentUrl();

        System.out.println("The current URL: " + url);
        System.out.println("The page title: " + pageTitle);

        driver.quit();
    }
}
