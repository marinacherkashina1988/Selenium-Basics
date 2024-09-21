package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E12MultiSelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dropdowm = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select = new Select(dropdowm);
        boolean multiple = select.isMultiple();
        System.out.println(multiple);
        select.selectByIndex(0);
        select.selectByValue("New York");
        select.selectByVisibleText("Ohio");
        select.selectByValue("Texas");

        select.deselectByIndex(0);
        select.deselectByValue("Ohio");
        select.deselectByVisibleText("New York");
        //driver.quit();
    }
}
