package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E14Alerts {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement clickMeBtn1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMeBtn1.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement clickMeBtn2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickMeBtn2.click();
        alert.dismiss();

        WebElement clickMeBtn3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        clickMeBtn3.click();
        alert.sendKeys("Hello!");
        alert.accept();
    }
}
