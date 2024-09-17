package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E6AdvancedXPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/advanceXpath.php");
        WebElement textField = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        textField.sendKeys("Harry Potter");
        WebElement textBox = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        textBox.sendKeys("Tom Soyer");
        WebElement textBox2 = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        textBox2.sendKeys("Example");
        driver.quit();
    }
}
