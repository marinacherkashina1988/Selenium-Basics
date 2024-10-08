package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class E25Screenshots {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        TakesScreenshot ss = (TakesScreenshot) driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File ("screenshot/image.png"));

    }
}
