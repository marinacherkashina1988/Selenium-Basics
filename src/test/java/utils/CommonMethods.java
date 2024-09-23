package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() throws IOException {

        String browserName = ConfigReader.read("C:\\Users\\ahmed\\IdeaProjects\\SeleniumBasics\\src\\test\\resources\\ConfigFiles\\config.properties", "browser");

        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
        driver.manage().window().maximize();

        String url = ConfigReader.read("C:\\Users\\ahmed\\IdeaProjects\\SeleniumBasics\\src\\test\\resources\\ConfigFiles\\config.properties", "url");
        driver.get(url);
    }
}
