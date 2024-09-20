package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement showCheckboxes = driver.findElement(By.xpath("//button[text()='Show/Hide Interests Section']"));
        showCheckboxes.click();

        List<WebElement> interests = driver.findElements(By.xpath("//div[@class='interest_section']"));
        for (WebElement interest:interests){
            if(interest.getAttribute("value").equals("Music")){
                interest.click();
            }
        }

    }
}
