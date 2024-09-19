package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4AbsoluteXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com");

        WebElement ex1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input"));
    }
}
