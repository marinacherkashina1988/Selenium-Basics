package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW5AdvanceXPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement book1 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        book1.sendKeys("The Catcher in the Rye");

        WebElement book2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("1984");

        WebElement book3 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book3.sendKeys("To Kill a Mockingbird");

        WebElement favBook1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favBook1.sendKeys("The Great Gatsby");

        WebElement favBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favBook2.sendKeys("Pride and Prejudice");

        WebElement favBook3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favBook3.sendKeys("Moby Dick");

        WebElement grandPa = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandPa.sendKeys("William");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Charles");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Emily");

    }
}
