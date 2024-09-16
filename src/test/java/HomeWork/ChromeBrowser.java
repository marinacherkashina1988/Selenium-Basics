package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title1 = driver.getTitle();
        System.out.println("The current page title: "+title1);

        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2 = driver.getTitle();
        System.out.println("The current page title: "+title2);

        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
