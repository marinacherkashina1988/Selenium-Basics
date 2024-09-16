package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4RelativeXPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement hobby = driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        hobby.sendKeys("Hiking");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click Here']"));
        btn.click();

        WebElement movies = driver.findElement(By.xpath("//input[contains(@name,'favoriteMovies')]"));
        movies.sendKeys("Interstellar");

        WebElement paragraph = driver.findElement(By.xpath("//label[contains(text(),'vitae qui eligendi commodi')]"));
        String text = paragraph.getText();
        System.out.println(text);

        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Springfield");

        WebElement personalEmail = driver.findElement(By.xpath("//input[starts-with(@id,'Personal')]"));
        personalEmail.sendKeys("john.doe123@gmail.com");

        WebElement officeEmail = driver.findElement(By.xpath("//input[starts-with(@id,'Office')]"));
        officeEmail.sendKeys("john.doe@company.com");

        WebElement profEmail = driver.findElement(By.xpath("//input[starts-with(@id,'Professional')]"));
        profEmail.sendKeys(" j.doe@professionals.org");

        WebElement clientName = driver.findElement(By.xpath("//input[contains(@name,'clientName')]"));
        clientName.sendKeys("John Doe");

        WebElement clientId = driver.findElement(By.xpath("//input[@data-detail='two' and @class='form-control'][1]"));
        clientId.sendKeys("75632");

        WebElement streetNo = driver.findElement(By.xpath("//input[contains(@name,'StreetNo')]"));
        streetNo.sendKeys("Pearl Street");

        WebElement houseNo = driver.findElement(By.xpath("//input[contains(@name,'HouseNo')]"));
        houseNo.sendKeys("6883");

    }
}
