package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;

public class HW8RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        List<WebElement> favBeverages = driver.findElements(By.xpath("//input[@name='beverage']"));
        for (WebElement beverage : favBeverages) {

            if (beverage.getAttribute("value").equals("Juice")) {
                beverage.click();
            }
        }

        List<WebElement> preferredEnv = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement environment : preferredEnv) {
            if (environment.getAttribute("value").equals("hybrid")) {
                environment.click();
            }
        }

        WebElement springBtn = driver.findElement(By.xpath("//input[@value='spring']"));
        boolean springBtnEnabled = springBtn.isEnabled();

        WebElement enableRadiBtn = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        if (!springBtnEnabled) {
            enableRadiBtn.click();
        }
        springBtn.click();

        WebElement showBtn = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        List<WebElement> seasons = driver.findElements(By.xpath("//input[@name='season']"));
        for (WebElement season : seasons) {
            if (season.getAttribute("value").equals("winter")) {
                season.click();
            } else {
                showBtn.click();
            }
        }

        WebElement winter = driver.findElement(By.xpath("//input[@value='winter']"));
        boolean winterDisplayed = winter.isDisplayed();
        if (winterDisplayed) {
            winter.click();
        }

        List<WebElement> favMeal = driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement meal : favMeal) {
            if (meal.getAttribute("value").equals("lunch")) {
                meal.click();
            }
        }
    }
}
