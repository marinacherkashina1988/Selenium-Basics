package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E8WebElementCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/selenium_commands_selector.php");

        WebElement textInput = driver.findElement(By.xpath("//input[@id='textInput']"));
        textInput.clear();
        textInput.sendKeys("New Text");

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='option1']"));
        radioBtn.click();
        boolean statusR1 = radioBtn.isSelected();
        System.out.println("The status of Radio button 1: " + statusR1);

        WebElement radioBtn2 = driver.findElement(By.xpath("//input[@value='option2']"));
        radioBtn2.click();
        boolean statusR2 = radioBtn2.isEnabled();
        System.out.println("The status of Radio button 1: " + statusR2);

        WebElement radioBtn3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean statusR3 = radioBtn3.isDisplayed();
        if (statusR3) {
            System.out.println("Radio button is displayed");
        } else {
            System.out.println("Radio button is not displayed");
        }

        WebElement displayBtn = driver.findElement(By.xpath("//button[text()='Toggle Visibility of Option 3']"));
        displayBtn.click();
        boolean isDisplayed = displayBtn.isDisplayed();
        if (isDisplayed) {
            System.out.println("The radio button3 is diplayed now");
        } else {
            System.out.println("try one more time");
        }

        WebElement textElement = driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textElement.getText();
        System.out.println(text);

        WebElement attribute = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        String value = attribute.getAttribute("data-custom-attribute");
        System.out.println(value);

        driver.quit();
    }
}
