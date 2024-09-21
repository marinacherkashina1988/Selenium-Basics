package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW10DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement fruitsDD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruitsDD.click();

        List<WebElement> fruits = driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li/a"));

        for (WebElement fruit : fruits) {
            String text1 = fruit.getText();
            if (text1.equals("Mango")) {
                fruit.click();
            }
        }

        WebElement hobbiesDD = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbiesDD.click();

        List<WebElement> hobbies = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));

        for (WebElement hobby : hobbies) {
            String text2 = hobby.getText();
            if (text2.equals("Reading")) {
                hobby.click();
            }
        }
        driver.quit();
    }
}
