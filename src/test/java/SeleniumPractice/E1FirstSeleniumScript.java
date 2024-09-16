package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1FirstSeleniumScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com");
        String url = driver.getCurrentUrl();
        System.out.println("The current URl: "+url);
        driver.quit();
    }
}
