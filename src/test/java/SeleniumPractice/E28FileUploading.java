package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E28FileUploading {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/upload-image.php");
        driver.manage().window().maximize();

        WebElement chooseFile = driver.findElement(By.id("image-file"));
        chooseFile.sendKeys("C:\\Users\\ahmed\\IdeaProjects\\SeleniumBasics\\screenshot\\image.png");

    }
}
