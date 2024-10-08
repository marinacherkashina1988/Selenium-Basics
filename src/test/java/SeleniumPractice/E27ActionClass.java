package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class E27ActionClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        driver.manage().window().maximize();

        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(hoverBtn).perform();

        WebElement rightClick = driver.findElement(By.id("show_context_menu"));
        actions.contextClick(rightClick).perform();

        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropBox = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(dragMe, dropBox).perform();
        //actions.clickAndHold(dragMe).moveToElement(dropBox).release().build().perform();
    }
}
