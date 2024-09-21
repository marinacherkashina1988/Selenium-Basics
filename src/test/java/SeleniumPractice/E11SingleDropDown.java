package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E11SingleDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dropdowm = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(dropdowm);
        select.selectByIndex(1);
        select.selectByValue("Wednesday");
        select.selectByVisibleText("Thursday");
        List<WebElement> allOptions = select.getOptions();
        for(WebElement text:allOptions){
            System.out.println(text.getText());
        }
    }
}
