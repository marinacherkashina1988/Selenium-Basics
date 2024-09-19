package LiveClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5RelativeXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath.php");

        WebElement hobby = driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        hobby.sendKeys("Painting");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement textelement = driver.findElement(By.xpath("//label[contains(text(),'sit amet consectetur ')]"));
        System.out.println(textelement.getText());

        WebElement startsWith = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        startsWith.sendKeys("Blah Blah Blah");

        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email.sendKeys("email@email.com");
        driver.quit();
    }
}
