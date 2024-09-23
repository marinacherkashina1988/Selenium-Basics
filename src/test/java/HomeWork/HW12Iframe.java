package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW12Iframe {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        WebElement age = driver.findElement(By.xpath("//input[@value='Option-1']"));
        age.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement cities = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel = new Select(cities);
        sel.selectByVisibleText("Chicago");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("Marina");
    }
}
