package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E9RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement maleRBtn1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        boolean selected = maleRBtn1.isSelected();
        if (!selected) {
            maleRBtn1.click();
            System.out.println("Male radio button is selected");
        } else {
            System.out.println("The button is already selected");
        }

        List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement age : ageGroup) {

            if (age.getAttribute("value").equals("15 - 50")) {
                age.click();
            }
        }
        //driver.quit();
    }
}
