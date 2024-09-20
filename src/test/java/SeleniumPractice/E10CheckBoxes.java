package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E10CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean selected1 = cb1.isSelected();
        if (!selected1) {
            cb1.click();
        }

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox : checkBoxes) {
            if (checkBox.getAttribute("value").equals("Option-4")) {
                checkBox.click();
            }
        }
        driver.quit();
    }
}
