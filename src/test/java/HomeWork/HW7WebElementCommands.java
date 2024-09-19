package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.sql.SQLOutput;

public class HW7WebElementCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement attribute = driver.findElement(By.xpath("//div[@id='textattr']"));
        String value = attribute.getAttribute("data-text-attr");
        System.out.println(value);

        WebElement mealOpt1 = driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean enabled = mealOpt1.isEnabled();
        if (enabled) {
            System.out.println("Option \"Music Festival\" is enabled");
        } else {
            System.out.println("Option \"Music Festival\" is disabled. Try again");
        }

        WebElement mealOpt2 = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean disabled = mealOpt2.isEnabled();
        if (!disabled) {
            System.out.println("Option \"Tech Talk\" is disabled");
        } else {
            System.out.println("Call customer service to book the selected meal option");
        }

        WebElement moreOpts = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        boolean displayed = moreOpts.isDisplayed();
        if (displayed) {
            moreOpts.click();
        } else {
            System.out.println("This option is not available at the moment");
        }

        WebElement mealOpt3 = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        boolean hiddenOptDisplayed = mealOpt3.isDisplayed();
        if (hiddenOptDisplayed) {
            mealOpt3.click();
        } else {
            System.out.println("Art Exibition menu is not available at the moment");
        }

        WebElement mysteryMsg = driver.findElement(By.xpath("//div[contains(text(),'Hover over me')]"));
        String msg = mysteryMsg.getAttribute("title");
        System.out.println(msg);

        WebElement box1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean enabledBox1 = box1.isEnabled();
        if (enabledBox1) {
            box1.click();
        } else {
            System.out.println("Checkbox 1 is disabled");
        }

        WebElement box2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean enabledBox2 = box2.isEnabled();
        if (!enabledBox2) {
            System.out.println("Checkbox 2 is disabled");
        } else {
            System.out.println("Please make sure Checkbox2 is disabled");
        }

        WebElement text = driver.findElement(By.xpath("//input[@id='inputField']"));
        text.clear();
        text.sendKeys("here is the custom text entered");

        driver.quit();
    }
}
