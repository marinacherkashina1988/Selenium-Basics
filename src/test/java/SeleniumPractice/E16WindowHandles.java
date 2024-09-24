package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E16WindowHandles {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");

        String mainPageWH = driver.getWindowHandle();
        System.out.println("The window handle of the main page is " + mainPageWH);

        WebElement instagram = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        WebElement facebook = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));

        facebook.click();
        instagram.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();

            if (url.equals("https://www.facebook.com/syntaxtechs/")) {
                WebElement textBox2 = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
                textBox2.sendKeys("Hello");
                break;
            }
        }
        System.out.println("The current focus of the driver is on : " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);
        System.out.println("The current focus of the driver is on : " + driver.getCurrentUrl());
    }
}
