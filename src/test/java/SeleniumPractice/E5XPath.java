package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5XPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath.php");
        WebElement username = driver.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("Moazzam");
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click Here']"));
        btn.click();
        WebElement secQuestion = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        secQuestion.sendKeys("What is your school name?");
        WebElement textContains = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit')]"));
        String text = textContains.getText();
        System.out.println(text);
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("Hello");
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("It is Field 1");
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("moazzam@example.com");
    }
}
