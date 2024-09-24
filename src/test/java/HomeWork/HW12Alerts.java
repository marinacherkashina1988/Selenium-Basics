package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW12Alerts {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement reminder = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        reminder.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement deleteFile = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        alert.dismiss();

        WebElement confirmation = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        if (confirmation.isDisplayed()) {
            System.out.println("File deletion canceled");
        }

        WebElement enterBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        enterBtn.click();
        alert.sendKeys("Marina");
        alert.accept();

        WebElement confirm = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        if (confirm.getText().equals("You have entered 'Marina' !")) {
            System.out.println("Marina");
        } else {
            System.out.println("Try again. You did something wrong");
        }
    }
}
